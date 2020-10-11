package com.example.hstudent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class StudentRep extends AppCompatActivity {
    TextInputLayout rname,remail,raddress,rcontact,rnorg,rcrime;
    Button sub;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_rep);

        rname=findViewById(R.id.name);
        remail=findViewById(R.id.email);
        raddress=findViewById(R.id.address);
        rcontact=findViewById(R.id.cont);
        rnorg=findViewById(R.id.org);
        rcrime=findViewById(R.id.crime);

        //save data to firebase on clicking go button
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode=FirebaseDatabase.getInstance();
                reference=rootNode.getReference("users");
                String name=rname.getEditText().getText().toString();
                String username=remail.getEditText().getText().toString();
                String address=raddress.getEditText().getText().toString();
                String cont=rcontact.getEditText().getText().toString();
                String orgname=rnorg.getEditText().getText().toString();
                String crime=rcrime.getEditText().getText().toString();
                UserHelperClass helperClass=new UserHelperClass(name,username,address,cont,orgname,crime);

                reference.child(cont).setValue(helperClass);
            }
        });

    }
}

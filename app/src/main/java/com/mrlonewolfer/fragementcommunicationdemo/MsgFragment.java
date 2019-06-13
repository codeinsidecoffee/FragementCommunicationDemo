package com.mrlonewolfer.fragementcommunicationdemo;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class MsgFragment extends Fragment implements View.OnClickListener {

    EditText edtName;

    Button btnSubmit;
    Context context;
    String msg="\n";

    public MsgFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_msg, container, false);
        edtName=view.findViewById(R.id.entName);
        btnSubmit=view.findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);
        context=getActivity();
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View v) {
       String newmsg=edtName.getText().toString();
       msg=msg+newmsg+"\n";
       FragmentManager fmg= getFragmentManager();
        ResultFragment rsFragment= (ResultFragment) fmg.findFragmentById(R.id.resultfragment);
        rsFragment.setMessage(msg);
        edtName.setText("");
        }


}

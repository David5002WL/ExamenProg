package com.example.david.examenprog;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentBotones extends Fragment {

    public FragmentBotones() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_botones, container, false);
        Button botonDatos = (Button) view.findViewById(R.id.botonDatos);
        Button botonAficiones = (Button) view.findViewById(R.id.botonAficiones);


        botonDatos.setOnClickListener( new View.OnClickListener() {



            public void onClick(View view){


                FragmentManager fragmentManager = getFragmentManager();

                FragmentTransaction transaction = fragmentManager.beginTransaction();

                DadesPersonalsFragment fragment = new DadesPersonalsFragment();
                transaction.add(R.id.LayoutVariante, fragment);

                transaction.commit();
            }

        });

        botonAficiones.setOnClickListener( new View.OnClickListener() {



            public void onClick(View view){


                FragmentManager fragmentManager = getFragmentManager();

                FragmentTransaction transaction = fragmentManager.beginTransaction();

                AficionsFragment fragment = new AficionsFragment();
                transaction.add(R.id.LayoutVariante, fragment);

                transaction.commit();
            }




        });





        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}

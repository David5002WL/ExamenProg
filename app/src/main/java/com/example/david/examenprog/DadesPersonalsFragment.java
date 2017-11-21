package com.example.david.examenprog;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class DadesPersonalsFragment extends Fragment {

    public DadesPersonalsFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmentpublic void onClick(View v) {
        View view = inflater.inflate(R.layout.fragment_dades_personals, container, false);


        Button guardarDatos = (Button) view.findViewById(R.id.botonGuardarDatos);
        final EditText datosPersonales = (EditText) view.findViewById(R.id.etNombreApellidos);
        final EditText edad = (EditText) view.findViewById(R.id.etEdad);

        guardarDatos.setOnClickListener( new View.OnClickListener() {



            public void onClick(View view){

                if(!datosPersonales.getText().toString().isEmpty() && !edad.getText().toString().isEmpty()) {
                    Intent explicit_intent;//Declaro el Intent

                    //Instanciamos el Intent dandole:
                    // el contexto y la clase a la cual nos deseamos dirigir
                    explicit_intent = new Intent(getActivity(), MainActivity.class);
                    String auxEdiNombre = datosPersonales.getText().toString();
                    String auxEdiEdad = edad.getText().toString();

                    explicit_intent.putExtra("nombreyapellidos", auxEdiNombre);//Guardamos una cadena
                    explicit_intent.putExtra("edad", auxEdiEdad);

                    //lo iniciamos pasandole la intencion, con todos sus parametros guardados
                    startActivity(explicit_intent);

                    Toast toast1 = Toast.makeText(getContext(), "Se ha guardado correctamente"
                            , Toast.LENGTH_SHORT);

                    toast1.show();
                }else{
                    Toast toast2 = Toast.makeText(getContext(), "Faltan campos por rellenar"
                            , Toast.LENGTH_SHORT);

                    toast2.show();
                }
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

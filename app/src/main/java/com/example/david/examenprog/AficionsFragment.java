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
import android.widget.RadioButton;
import android.widget.Toast;


public class AficionsFragment extends Fragment {


    public AficionsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_aficions, container, false);


        Button botonGuardarDatos = (Button) view.findViewById(R.id.botonGuardarDatos2);
        final RadioButton libros = (RadioButton) view.findViewById(R.id.radioButtonLibros);
        final RadioButton revistas = (RadioButton) view.findViewById(R.id.radioButtonRevistas);
        final RadioButton redes = (RadioButton) view.findViewById(R.id.radioButtonRedes);

        botonGuardarDatos.setOnClickListener( new View.OnClickListener() {



            public void onClick(View view){

                if(!libros.isChecked() && !revistas.isChecked()
                        && !redes.isChecked()) {


                    Toast toast1 = Toast.makeText(getContext(), "Faltan campos por rellenar"
                            , Toast.LENGTH_SHORT);

                    toast1.show();
                }else{

                    Intent explicit_intent;//Declaro el Intent

                    //Instanciamos el Intent dandole:
                    // el contexto y la clase a la cual nos deseamos dirigir
                    explicit_intent = new Intent(getActivity(), MainActivity.class);
                    String auxEdiLibros = libros.getText().toString();
                    String auxEdiRevistas = revistas.getText().toString();
                    String auxEdiRedes = redes.getText().toString();

                    explicit_intent.putExtra("libros", auxEdiLibros);//Guardamos una cadena
                    explicit_intent.putExtra("revistas", auxEdiRevistas);
                    explicit_intent.putExtra("redes", auxEdiRedes);

                    //lo iniciamos pasandole la intencion, con todos sus parametros guardados
                    startActivity(explicit_intent);

                    Toast toast2 = Toast.makeText(getContext(), "se ha guardado correctamente"
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

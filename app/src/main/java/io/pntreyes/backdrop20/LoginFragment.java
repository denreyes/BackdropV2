package io.pntreyes.backdrop20;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.pntreyes.backdrop20.LoginActivity;
import io.pntreyes.backdrop20.MainActivity;

/**
 * Created by Dj on 11/26/2015.
 */
public class LoginFragment extends Fragment{

        @Override
        public void onActivityCreated(@Nullable Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            ((LoginActivity)getActivity()).component().inject(this);
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            return super.onCreateView(inflater, container, savedInstanceState);
        }
}

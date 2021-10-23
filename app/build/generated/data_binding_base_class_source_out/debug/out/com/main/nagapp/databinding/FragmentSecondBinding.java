// Generated by view binder compiler. Do not edit!
package com.main.nagapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.chip.Chip;
import com.main.nagapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSecondBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView addActualTitle;

  @NonNull
  public final TextView addBad;

  @NonNull
  public final Button addButton;

  @NonNull
  public final TextView addGood;

  @NonNull
  public final EditText addTitle;

  @NonNull
  public final Chip chip4;

  @NonNull
  public final Chip chip5;

  @NonNull
  public final EditText editTextTextPersonName;

  @NonNull
  public final EditText editTextTextPersonName2;

  @NonNull
  public final EditText editTextTime;

  private FragmentSecondBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView addActualTitle, @NonNull TextView addBad, @NonNull Button addButton,
      @NonNull TextView addGood, @NonNull EditText addTitle, @NonNull Chip chip4,
      @NonNull Chip chip5, @NonNull EditText editTextTextPersonName,
      @NonNull EditText editTextTextPersonName2, @NonNull EditText editTextTime) {
    this.rootView = rootView;
    this.addActualTitle = addActualTitle;
    this.addBad = addBad;
    this.addButton = addButton;
    this.addGood = addGood;
    this.addTitle = addTitle;
    this.chip4 = chip4;
    this.chip5 = chip5;
    this.editTextTextPersonName = editTextTextPersonName;
    this.editTextTextPersonName2 = editTextTextPersonName2;
    this.editTextTime = editTextTime;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSecondBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSecondBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_second, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSecondBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_actual_title;
      TextView addActualTitle = ViewBindings.findChildViewById(rootView, id);
      if (addActualTitle == null) {
        break missingId;
      }

      id = R.id.add_bad;
      TextView addBad = ViewBindings.findChildViewById(rootView, id);
      if (addBad == null) {
        break missingId;
      }

      id = R.id.add_button;
      Button addButton = ViewBindings.findChildViewById(rootView, id);
      if (addButton == null) {
        break missingId;
      }

      id = R.id.add_good;
      TextView addGood = ViewBindings.findChildViewById(rootView, id);
      if (addGood == null) {
        break missingId;
      }

      id = R.id.add_title;
      EditText addTitle = ViewBindings.findChildViewById(rootView, id);
      if (addTitle == null) {
        break missingId;
      }

      id = R.id.chip4;
      Chip chip4 = ViewBindings.findChildViewById(rootView, id);
      if (chip4 == null) {
        break missingId;
      }

      id = R.id.chip5;
      Chip chip5 = ViewBindings.findChildViewById(rootView, id);
      if (chip5 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName;
      EditText editTextTextPersonName = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName2;
      EditText editTextTextPersonName2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName2 == null) {
        break missingId;
      }

      id = R.id.editTextTime;
      EditText editTextTime = ViewBindings.findChildViewById(rootView, id);
      if (editTextTime == null) {
        break missingId;
      }

      return new FragmentSecondBinding((ConstraintLayout) rootView, addActualTitle, addBad,
          addButton, addGood, addTitle, chip4, chip5, editTextTextPersonName,
          editTextTextPersonName2, editTextTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

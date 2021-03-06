// Generated by view binder compiler. Do not edit!
package com.main.nagapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.main.nagapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFirstBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton fab2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final TextView textviewFirst;

  @NonNull
  public final ScrollView toDoItems;

  private FragmentFirstBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton fab2, @NonNull ImageView imageView3,
      @NonNull TextView textviewFirst, @NonNull ScrollView toDoItems) {
    this.rootView = rootView;
    this.fab2 = fab2;
    this.imageView3 = imageView3;
    this.textviewFirst = textviewFirst;
    this.toDoItems = toDoItems;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_first, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirstBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fab2;
      FloatingActionButton fab2 = ViewBindings.findChildViewById(rootView, id);
      if (fab2 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.textview_first;
      TextView textviewFirst = ViewBindings.findChildViewById(rootView, id);
      if (textviewFirst == null) {
        break missingId;
      }

      id = R.id.toDoItems;
      ScrollView toDoItems = ViewBindings.findChildViewById(rootView, id);
      if (toDoItems == null) {
        break missingId;
      }

      return new FragmentFirstBinding((ConstraintLayout) rootView, fab2, imageView3, textviewFirst,
          toDoItems);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

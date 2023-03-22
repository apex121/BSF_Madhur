package com.bsf.firebaselogin.databinding;
import com.bsf.firebaselogin.R;
import com.bsf.firebaselogin.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.progressBar, 1);
        sViewsWithIds.put(R.id.header_cover_image, 2);
        sViewsWithIds.put(R.id.user_profile_photo, 3);
        sViewsWithIds.put(R.id.profile_layout, 4);
        sViewsWithIds.put(R.id.drop_down_option_menu, 5);
        sViewsWithIds.put(R.id.user_profile_name, 6);
        sViewsWithIds.put(R.id.user_profile_short_bio, 7);
        sViewsWithIds.put(R.id.old_email, 8);
        sViewsWithIds.put(R.id.new_email, 9);
        sViewsWithIds.put(R.id.password, 10);
        sViewsWithIds.put(R.id.newPassword, 11);
        sViewsWithIds.put(R.id.changeEmail, 12);
        sViewsWithIds.put(R.id.changePass, 13);
        sViewsWithIds.put(R.id.send, 14);
        sViewsWithIds.put(R.id.remove, 15);
        sViewsWithIds.put(R.id.change_email_button, 16);
        sViewsWithIds.put(R.id.change_password_button, 17);
        sViewsWithIds.put(R.id.sending_pass_reset_button, 18);
        sViewsWithIds.put(R.id.remove_user_button, 19);
        sViewsWithIds.put(R.id.sign_out, 20);
        sViewsWithIds.put(R.id.play_video, 21);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[16]
            , (android.widget.Button) bindings[13]
            , (android.widget.Button) bindings[17]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[11]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[10]
            , (android.widget.Button) bindings[21]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.ProgressBar) bindings[1]
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[19]
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[18]
            , (android.widget.Button) bindings[20]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.TextView) bindings[7]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}
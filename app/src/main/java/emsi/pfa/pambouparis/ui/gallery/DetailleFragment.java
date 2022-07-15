package emsi.pfa.pambouparis.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import emsi.pfa.pambouparis.databinding.FragmentDetailleBinding;

public class DetailleFragment extends Fragment {
    private FragmentDetailleBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentDetailleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

       // final TextView textView = binding.textGallery;
       // textView.setText("this is Detaille pro fragement");
        // galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        WebView myWebView =  binding.webview;
        myWebView.loadUrl("https://www.emsi.ma/");
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

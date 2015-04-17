package aa.eddy.cube.com.network_cube.ui.viewholders;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import aa.eddy.cube.com.network_cube.R;
import in.srain.cube.image.CubeImageView;
import in.srain.cube.image.ImageLoader;
import in.srain.cube.views.list.ViewHolderBase;

public class StringBigImageViewHolder extends ViewHolderBase<String> {

    private CubeImageView mImageView;
    private ImageLoader mImageLoader;

    public StringBigImageViewHolder(ImageLoader imageLoader) {
        mImageLoader = imageLoader;
    }

    @Override
    public View createView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.load_big_image_list_item, null);
        mImageView = (CubeImageView) view.findViewById(R.id.load_big_image_list_item_image_view);
        mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        LinearLayout.LayoutParams lyp = new LinearLayout.LayoutParams(ImageSize.sBigImageSize, ImageSize.sBigImageSize);
        mImageView.setLayoutParams(lyp);

        return view;
    }

    @Override
    public void showData(int position, String itemData) {
        mImageView.loadImage(mImageLoader, itemData, ImageSize.sBigImageReuseInfo);
    }
}

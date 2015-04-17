package aa.eddy.cube.com.network_cube;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import aa.eddy.cube.com.network_cube.datamodel.Images;
import aa.eddy.cube.com.network_cube.ui.viewholders.StringBigImageViewHolder;
import in.srain.cube.app.lifecycle.IComponentContainer;
import in.srain.cube.app.lifecycle.LifeCycleComponent;
import in.srain.cube.image.ImageLoader;
import in.srain.cube.image.ImageLoaderFactory;
import in.srain.cube.views.list.ListViewDataAdapter;


public class MainActivity extends ActionBarActivity implements IComponentContainer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageLoader imageLoader = ImageLoaderFactory.create(this).tryToAttachToContainer(this);

        ListViewDataAdapter<String> adapter = new ListViewDataAdapter<String>();
        adapter.setViewHolderClass(this, StringBigImageViewHolder.class, imageLoader);
        adapter.getDataList().addAll(Images.getImages());

        ListView listView = (ListView)findViewById(R.id.load_big_image_list_view);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void addComponent(LifeCycleComponent lifeCycleComponent) {
        //lifeCycleComponent:in.srain.cube.image.ImageLoader@419f6d18
        Log.i("ss", "addComponent___________________________lifeCycleComponent:"+lifeCycleComponent.toString());


    }
}

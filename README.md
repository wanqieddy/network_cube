        ImageLoader imageLoader = ImageLoaderFactory.create(this).tryToAttachToContainer(this);

        ListViewDataAdapter<String> adapter = new ListViewDataAdapter<String>();
        adapter.setViewHolderClass(this, StringBigImageViewHolder.class, imageLoader);
        adapter.getDataList().addAll(Images.getImages());

        ListView listView = (ListView)findViewById(R.id.load_big_image_list_view);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

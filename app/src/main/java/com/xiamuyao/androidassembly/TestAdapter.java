package com.xiamuyao.androidassembly;

import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.xiamuyao.androidassembly.bean.Level0Item;
import com.xiamuyao.androidassembly.bean.Level1Item;

import java.util.ArrayList;

public class TestAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {

    public TestAdapter(ArrayList<MultiItemEntity> data) {
        super(data);
        addItemType(0, R.layout.item_one);
        addItemType(1, R.layout.item_two);
    }

    @Override
    protected void convert(final BaseViewHolder helper, final MultiItemEntity item) {

        switch (helper.getItemViewType()) {
            case 0:
                final Level0Item mLevel0Item = (Level0Item) item;
                helper.setText(R.id.item_one, mLevel0Item.title);

                helper.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int pos = helper.getAdapterPosition();
                        if (mLevel0Item.isExpanded()) {
                            collapse(pos);
                        } else {
                            expand(pos);
                        }
                    }
                });
                helper.addOnClickListener(R.id.item_iv_one);
                break;
            case 1:
                final Level1Item mLevel1Item = (Level1Item) item;
                helper.setText(R.id.item_two, mLevel1Item.title);
                helper.addOnClickListener(R.id.item_two);
                break;
            default:
                break;
        }


    }


}

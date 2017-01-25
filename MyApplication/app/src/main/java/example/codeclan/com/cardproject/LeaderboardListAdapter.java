//package example.codeclan.com.cardproject;
//
//import android.view.View;
//import android.content.Context;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.TextView;
//
//import java.util.List;
//
///**
// * Created by user on 25/01/2017.
// */
//public class LeaderboardListAdapter extends BaseAdapter {
//
//    private Context mContext;
//    private Leaderboard mLeaderboard;
//
//    public LeaderboardListAdapter(Context mContext, Leaderboard mLeaderboard){
//        this.mContext = mContext;
//        this.mLeaderboard = mLeaderboard;
//    }
//
//    @Override
//    public int getCount() {
//        return mLeaderboard.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return mLeaderboard.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View v = View.inflate(mContext, R.layout.winners_list, null);
//        TextView tvName = (TextView)v.findViewById(R.id.winners_name);
//        TextView tvWins = (TextView)v.findViewById(R.id.count);
//
//        tvName.setText(mLeaderboard.get(position).getHoFName());
//        tvWins.setText(String.valueOf(mLeaderboard.get(position).getNumberofWins()))
//        return null;
//    }
//
//
//
//
//}

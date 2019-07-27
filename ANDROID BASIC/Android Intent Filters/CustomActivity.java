package skyward.combatant.intentfilters;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class CustomActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstantceState){
        super.onCreate(savedInstantceState);
        setContentView(R.layout.custom_view);
        TextView label=(TextView)findViewById(R.id.show_data);
        Uri url=getIntent().getData();
        label.setText(url.toString());
    }
}

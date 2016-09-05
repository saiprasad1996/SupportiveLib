package tk.saiprasadm.intentmanagement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class AppUtils {

    public static boolean isAppInstalled(Context context, String packageName) {
        try {
            context.getPackageManager().getApplicationInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static List getInstalledAppsPackages(Context context) {
        final PackageManager packageManager = context.getPackageManager();
        List<ApplicationInfo> infoList = packageManager.getInstalledApplications(PackageManager.GET_META_DATA);
        return infoList;

    }

    public static Drawable getAppIcon(Context context, String packageName) throws PackageManager.NameNotFoundException {

        final PackageManager packageManager = context.getPackageManager();
        Drawable appIcon = packageManager.getApplicationIcon(packageName);

        return appIcon;
    }

    public static String getAppName(Context context, ApplicationInfo info) {
        final PackageManager packageManager = context.getPackageManager();
        String appName = null;
        try {
            appName = packageManager.getApplicationLabel(info).toString();
        } catch (Exception nnf) {
            Toast.makeText(context, "Name not found", Toast.LENGTH_SHORT).show();
        }
        return appName;
    }

    public ArrayList<AppInfo> getAppsNames(Context context) {
        ArrayList<AppInfo> list = new ArrayList<>();
        List<PackageInfo> apps = context.getPackageManager().getInstalledPackages(0);
        for (int i = 0; i < apps.size(); i++) {
            PackageInfo p = apps.get(i);
            AppInfo info = new AppInfo();
            if (context.getPackageManager().getLaunchIntentForPackage(p.packageName) != null) {
                info.appName = p.applicationInfo.loadLabel(context.getPackageManager()).toString();
                Log.d("info app", info.appName);
                info.appPackage = p.packageName;
                list.add(info);
            }
        }
        return list;
    }

    public class AppInfo {
        String appName = "";
        String appPackage = "";
    }
}

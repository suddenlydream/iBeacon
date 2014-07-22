package com.dreaner.ibeacon;

import java.util.List;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.estimote.sdk.Beacon;
import com.estimote.sdk.BeaconManager;
import com.estimote.sdk.BeaconManager.MonitoringListener;
import com.estimote.sdk.Region;

public class MainActivity extends FragmentActivity {
	private static final String TAG = "MainActivity";
	private static final String ESTIMOTE_PROXIMITY_UUID = "B9407F30-F5F8-466E-AFF9-25556B57FE6D";
	private static final Region ALL_ESTIMOTE_BEACONS = new Region("maikelong",
			null, null, null);

	private BeaconManager beaconManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
		setContentView(R.layout.activity_main);
		// beaconManager = new BeaconManager(this);
		// beaconManager.setRangingListener(new BeaconManager.RangingListener()
		// {
		// @Override
		// public void onBeaconsDiscovered(Region region, List<Beacon> beacons)
		// {
		// Log.d(TAG, "Ranged beacons: " + beacons + " region: " + region);
		// }
		// });
		//
		// beaconManager.setMonitoringListener(new MonitoringListener() {
		//
		// @Override
		// public void onExitedRegion(Region region) {
		// Log.d(TAG, "onExitedRegion region: " + region);
		// }
		//
		// @Override
		// public void onEnteredRegion(Region region, List<Beacon> beacons) {
		// Log.d(TAG, "onEnteredRegion region: " + region + " beacons: "
		// + beacons);
		// }
		// });
		test();
	}

	private void test() {
		BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "onStart");
		// beaconManager.connect(new BeaconManager.ServiceReadyCallback() {
		// @Override
		// public void onServiceReady() {
		// try {
		// beaconManager.startRanging(ALL_ESTIMOTE_BEACONS);
		// beaconManager.startMonitoring(ALL_ESTIMOTE_BEACONS);
		// } catch (RemoteException e) {
		// Log.e(TAG, "Cannot start ranging", e);
		// }
		// }
		// });
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, "onPause");
		// try {
		// beaconManager.stopRanging(ALL_ESTIMOTE_BEACONS);
		// } catch (RemoteException e) {
		// Log.e(TAG, "Cannot stop but it does not matter now", e);
		// }
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy");
		// beaconManager.disconnect();
	}
}

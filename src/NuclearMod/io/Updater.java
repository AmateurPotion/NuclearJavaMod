package NuclearMod.io;

import arc.Core;
import arc.Net;
import arc.util.Log;
import arc.util.serialization.Jval;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Updater {
    private static String tempString;

    public void checkUpdate(){
        InputStream inputStream;
        int currentVersion, repoVersion;
        if(new SocketManager().connectionCheck("www.google.com", 80)) {
            inputStream = getClass().getResourceAsStream("/mod.json");
            Jval jval = Jval.read(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            currentVersion = jval.getInt("version",1);
            repoVersion = new Updater().getLatestVersion();

            if(currentVersion < repoVersion) {
                Log.info("새로운 버전이 나왔습니다.");
                modUpdate();
            } else {
                Log.info("최신버전입니다.");
            }
        } else {
            Log.info("인터넷에 연결되지 않아 버전 체크를 하지 못했습니다.");
            offlineInit();
        }
    }

    public int getLatestVersion(){
        Core.net.httpGet("https://raw.githubusercontent.com/NamedoOf/NuclearJavaMod/main/mod.json", res -> {
            if (res.getStatus() == Net.HttpStatus.OK) {
                tempString = res.getResultAsString();
            }} , error -> {});

        while (tempString == null){}
        Jval jval = Jval.read(tempString);
        int version = jval.getInt("version", 1);
        tempString = null;

        return version;
    }

    private void modUpdate(){
        // 새로운 모드버전이 있을 때 모드 업데이트 코드
    }

    private void offlineInit(){
        // 버전 체크를 하지 못했을때 초기화 코드
    }
}

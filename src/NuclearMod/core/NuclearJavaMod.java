package NuclearMod.core;

import arc.Events;
import arc.util.CommandHandler;

import mindustry.game.EventType.*;
import mindustry.mod.Mod;

import NuclearMod.io.Updater;

/** 모드 진입점이므로 class unused 경고 무시 **/
@SuppressWarnings("unused")
public class NuclearJavaMod extends Mod {
    public NuclearJavaMod(){
        Events.on(ClientLoadEvent.class, e -> {
            // 클라이언트 로드 이벤트
            new Updater().checkUpdate(); // 업데이트 메소드
            new NucContentLoader().load(); // 컨텐츠 로딩
        });

        Events.on(WorldLoadEvent.class, e -> {
            // 월드 로드 이벤트
            // 게임 자체 구현 방식으로 인해 클라이언트보다는 월드가 먼저 로딩됨
        });
    }

    @Override
    public void init(){
        // 초기화 메소드
        // 로딩 메소드랑 비슷하다고 보면 됨
    }

    @Override
    public void loadContent(){
        // 컨텐트 로딩 이벤트
        // 여기에 컨텐트 추가 메소드들을 집어넣을 경우 대부분 패키지에 모드명이 붙으니
        // 가급적이면 클라 로드 이벤트에 추가하는 걸 추천
        // 월드 로드 이벤트는 월드 생성시마다 호출되므로 비추
    }

    @Override
    public void registerServerCommands(CommandHandler handler){
        // 서버 커맨드 추가 메소드
        // 이 메소드를 이용하여 플러그인이 서버 명령어를 추가하는 것처럼 모드도 명령어 추가가능
    }

    @Override
    public void registerClientCommands(CommandHandler handler) {
        // 클라이언트 커맨드 추가 메소드
        // 이 메소드를 이용하여 플러그인이 클라이언트 명령어를 추가하는 것처럼 모드도 명령어 추가가능
    }
}

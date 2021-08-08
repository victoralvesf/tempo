package com.cappielloantonio.play.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.cappielloantonio.play.App;
import com.cappielloantonio.play.util.PreferenceUtil;

@Entity(tableName = "download")
public class Download {
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "id")
    private String songID;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "albumId")
    private String albumId;

    @ColumnInfo(name = "albumName")
    private String albumName;

    @ColumnInfo(name = "artistId")
    private String artistId;

    @ColumnInfo(name = "artistName")
    private String artistName;

    @ColumnInfo(name = "primary")
    private String primary;

    @ColumnInfo(name = "duration")
    private long duration;

    @ColumnInfo(name = "server")
    private String server;

    public Download(String songID, String title, String albumId, String albumName, String artistId, String artistName, String primary, long duration, String server) {
        this.songID = songID;
        this.title = title;
        this.albumId = albumId;
        this.albumName = albumName;
        this.artistId = artistId;
        this.artistName = artistName;
        this.primary = primary;
        this.duration = duration;
        this.server = server;
    }

    public Download(Song song) {
        this.songID = song.getId();
        this.title = song.getTitle();
        this.albumId = song.getAlbumId();
        this.albumName = song.getAlbumName();
        this.artistId = song.getArtistId();
        this.artistName = song.getArtistName();
        this.primary = song.getPrimary();
        this.duration = song.getDuration();
        this.server = PreferenceUtil.getInstance(App.getInstance()).getServerId();
    }

    public String getSongID() {
        return songID;
    }

    public void setSongID(String songID) {
        this.songID = songID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
}

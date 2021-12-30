package com.example.dynamicboardcore.util.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "board_config")
public class BoardConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "board_code", length = 30, nullable = false)
    private String boardCode;
    @Column(name = "board_name", length = 100, nullable = false)
    private String boardName;
    @Column(name = "notice", length = 150)
    private String notice;
    @Column(name = "upload_count", nullable = false)
    private int uploadCount;
    @Column(name = "board_new", nullable = false)
    private int boardNew;
    @Column(name = "hot", nullable = false)
    private int hot;
    @Column(name = "use_good", nullable = false)
    private boolean useGood;
    @Column(name = "use_nogood", nullable = false)
    private boolean useNoGood;
    @Column(name = "use_recaptcha", nullable = false)
    private boolean useRecaptcha;
    @Column(name = "use_rss_view", nullable = false)
    private boolean useRssView;
    @Column(name = "use_editor", nullable = false)
    private boolean useEditor;
    @Column(name = "use_secret", nullable = false)
    private boolean useSecret;
    @Column(name = "list_level", nullable = false)
    private int listLevel;
    @Column(name = "read_level", nullable = false)
    private int readLevel;
    @Column(name = "write_level", nullable = false)
    private int writeLevel;
    @Column(name = "extra1")
    private String extra1;
    @Column(name = "extra2")
    private String extra2;
    @Column(name = "extra3")
    private String extra3;
}

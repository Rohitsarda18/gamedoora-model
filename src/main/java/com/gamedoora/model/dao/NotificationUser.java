package com.gamedoora.model.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "notification_user")
public class NotificationUser extends Audit implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "BIGINT NOT NULL")
    private long id;

    @Column(name = "notification_id")
    private Notifications notifications;

    @Column(name = "user_id")
    private Users users;

    @Column(name = "is_seen" , columnDefinition = "BOOLEAN NOT NULL")
    private boolean isSeen;

    @Column(name = "is_clicked" , columnDefinition = "BOOLEAN NOT NULL")
    private boolean isClicked;
    // figure out how to work around this

    /* ColumnDefinition syntax has been updated, using nullable=false doesn't seem to work consistently.*/
}

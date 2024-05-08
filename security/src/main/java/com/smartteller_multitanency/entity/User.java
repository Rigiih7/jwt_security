package com.smartteller_multitanency.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")

public class User implements UserDetails, Serializable {
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Column(name = "UserSecurityID")
    private String userSecurityID;

    @Column(name = "userName")
    private String userName;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "state")
    private String state;

    @Column(name = "expiryDate")
    private String expiryDate;

    @Column(name = "windowsSecurityID")
    private String windowsSecurityID;

    @Column(name = "changePassword")
    private String changePassword;

    @Column(name = "licenseType")
    private String licenseType;

    @Column(name = "authenticationEmail")
    private int authenticationEmail;

    @Column(name = "contactEmail")
    private Date contactEmail;

    @Column(name = "exchangeIdentifier")
    private String exchangeIdentifier;

    @Column(name = "applicationId")
    private String applicationId;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.exceptions.InsufficientPrivilegesException
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.AH;
import celestial.Aq_1;
import celestial.QY;
import celestial.ZG;
import celestial.cN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rmA_2;
import celestial.rmF_2;
import celestial.rmL_2;
import celestial.rmN_2;
import celestial.rmc_3;
import celestial.rmn_3;
import celestial.rmv_3;
import celestial.rpu_3;
import celestial.rud_3;
import celestial.ruv_3;
import celestial.ryK_2;
import celestial.ryo_3;
import celestial.vm_3;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.math.BigInteger;
import java.security.PublicKey;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Al_1
implements AH {
    private static final Logger id_class = LogManager.getLogger();
    private final QY id_break;
    private final vm_3 id_byte;
    private final Consumer<rgP_2> id_protected;
    private final rud_3 id_throws;
    private GameProfile id_case;

    public Al_1(rud_3 rud_32, QY qY, vm_3 vm_32, Consumer<rgP_2> consumer) {
        this.id_throws = rud_32;
        this.id_break = qY;
        this.id_byte = vm_32;
        this.id_protected = consumer;
    }

    @Override
    public void id_class(rmF_2 rmF_22) {
        this.id_throws.id_class(rmF_22.id_break());
    }

    @Override
    public void id_class(rmL_2 rmL_22) {
        if (!this.id_throws.id_protected()) {
            this.id_throws.id_class(rmL_22.id_break());
        }
    }

    @Override
    public void id_class(rmv_3 rmv_32) {
        this.id_protected.accept(new rgn_3("connect.negotiating"));
        this.id_throws.id_class(new rmN_2(rmv_32.id_break(), null));
    }

    @Override
    public rud_3 id_class() {
        return this.id_throws;
    }

    private rgP_2 id_class(String string) {
        try {
            this.id_break().joinServer(this.id_break.id_while().id_throws(), this.id_break.id_while().id_protected(), string);
            return null;
        }
        catch (AuthenticationUnavailableException authenticationUnavailableException) {
            return new rgn_3("disconnect.loginFailedInfo", new rgn_3("disconnect.loginFailedInfo.serversUnavailable"));
        }
        catch (InvalidCredentialsException invalidCredentialsException) {
            return new rgn_3("disconnect.loginFailedInfo", new rgn_3("disconnect.loginFailedInfo.invalidSession"));
        }
        catch (InsufficientPrivilegesException insufficientPrivilegesException) {
            return new rgn_3("disconnect.loginFailedInfo", new rgn_3("disconnect.loginFailedInfo.insufficientPrivileges"));
        }
        catch (AuthenticationException authenticationException) {
            return new rgn_3("disconnect.loginFailedInfo", authenticationException.getMessage());
        }
    }

    @Override
    public void id_class(rmn_3 rmn_32) {
        this.id_protected.accept(new rgn_3("connect.joining"));
        this.id_case = rmn_32.id_break();
        this.id_throws.id_class(ruv_3.PLAY);
        this.id_throws.id_class(new Aq_1(this.id_break, this.id_byte, this.id_throws, this.id_case));
    }

    @Override
    public void id_class(rgP_2 rgP_22, rgP_2 rgP_23) {
        this.id_break.id_break(new ZG(this.id_byte, cN_2.id_implements, rgP_23));
    }

    @Override
    public void id_class(rmA_2 rmA_22) {
        rmc_3 rmc_32;
        Cipher cipher;
        Cipher cipher2;
        String string;
        try {
            SecretKey secretKey = ryK_2.id_class();
            PublicKey publicKey = rmA_22.id_byte();
            string = new BigInteger(ryK_2.id_class(rmA_22.id_break(), publicKey, secretKey)).toString(16);
            cipher2 = ryK_2.id_class(2, secretKey);
            cipher = ryK_2.id_class(1, secretKey);
            rmc_32 = new rmc_3(secretKey, publicKey, rmA_22.id_protected());
        }
        catch (ryo_3 ryo_32) {
            throw new IllegalStateException("Protocol error", ryo_32);
        }
        this.id_protected.accept(new rgn_3("connect.authorizing"));
        rpu_3.id_class.submit(() -> {
            rgP_2 rgP_22 = this.id_class(string);
            if (rgP_22 != null) {
                if (this.id_break.S() == null || !this.id_break.S().id_protected()) {
                    this.id_throws.id_class(rgP_22);
                    return;
                }
                id_class.warn(rgP_22.getString());
            }
            this.id_protected.accept(new rgn_3("connect.encrypting"));
            this.id_throws.id_class(rmc_32, (GenericFutureListener<? extends Future<? super Void>>)((GenericFutureListener)future -> this.id_throws.id_class(cipher2, cipher)));
        });
    }

    private MinecraftSessionService id_break() {
        return this.id_break.r();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rCr_1;
import celestial.rVv_1;
import celestial.rnW_2;
import celestial.rnp_3;
import celestial.rnv_3;
import celestial.rrGx_1;
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnZ_2
extends rCr_1 {
    private static final Logger id_case = LogManager.getLogger();

    @Override
    public boolean id_byte(GameProfile gameProfile) {
        return !this.id_int() || this.id_case(gameProfile) || this.id_finally().id_class(gameProfile);
    }

    @Override
    public /* synthetic */ rnW_2 id_byte() {
        return this.id_break();
    }

    public rnZ_2(rnv_3 rnv_32, rVv_1 rVv_12, rrGx_1 rrGx_12) {
        super(rnv_32, rVv_12, rrGx_12, rnv_32.id_class().id_import);
        rnp_3 rnp_32 = rnv_32.id_class();
        this.id_class(rnp_32.id_static);
        super.id_class((Boolean)rnp_32.P.get());
        this.id_goto();
        this.id_return();
        this.id_public();
        this.id_synchronized();
        this.id_while();
        this.id_instanceof();
        this.id_try();
        if (!this.id_finally().id_break().exists()) {
            this.id_throw();
        }
    }

    @Override
    public void id_class(GameProfile gameProfile) {
        super.id_class(gameProfile);
        this.id_try();
    }

    @Override
    public void id_class(boolean bl) {
        super.id_class(bl);
        this.id_break().id_finally(bl);
    }

    @Override
    public void id_class() {
        this.id_instanceof();
    }

    public rnv_3 id_break() {
        return (rnv_3)super.id_byte();
    }

    @Override
    public void id_break(GameProfile gameProfile) {
        super.id_break(gameProfile);
        this.id_try();
    }

    private void id_goto() {
        try {
            this.id_catch().id_case();
        }
        catch (IOException iOException) {
            id_case.warn("Failed to load user banlist: ", (Throwable)iOException);
        }
    }

    private void id_instanceof() {
        try {
            this.id_finally().id_case();
        }
        catch (Exception exception) {
            id_case.warn("Failed to load white-list: ", (Throwable)exception);
        }
    }

    private void id_return() {
        try {
            this.id_catch().id_throws();
        }
        catch (IOException iOException) {
            id_case.warn("Failed to save user banlist: ", (Throwable)iOException);
        }
    }

    private void id_throw() {
        try {
            this.id_finally().id_throws();
        }
        catch (Exception exception) {
            id_case.warn("Failed to save white-list: ", (Throwable)exception);
        }
    }

    private void id_try() {
        try {
            this.id_native().id_throws();
        }
        catch (Exception exception) {
            id_case.warn("Failed to save operators list: ", (Throwable)exception);
        }
    }

    private void id_while() {
        try {
            this.id_native().id_case();
        }
        catch (Exception exception) {
            id_case.warn("Failed to load operators list: ", (Throwable)exception);
        }
    }

    private void id_public() {
        try {
            this.id_private().id_case();
        }
        catch (IOException iOException) {
            id_case.warn("Failed to load ip banlist: ", (Throwable)iOException);
        }
    }

    @Override
    public boolean id_protected(GameProfile gameProfile) {
        return this.id_native().id_class(gameProfile);
    }

    private void id_synchronized() {
        try {
            this.id_private().id_throws();
        }
        catch (IOException iOException) {
            id_case.warn("Failed to save ip banlist: ", (Throwable)iOException);
        }
    }
}


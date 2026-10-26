/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ThreadLocalRandom
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.id_3;
import celestial.rcd_3;
import celestial.rfU_2;
import io.netty.util.internal.ThreadLocalRandom;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ix_3 {
    private static final Logger id_class = LogManager.getLogger();
    private final double id_break;
    private final id_3 id_byte;
    private final Supplier<String> id_protected;
    private final UUID id_throws;

    public id_3 id_byte() {
        return this.id_byte;
    }

    public ix_3(String string, double d, id_3 id_32) {
        this(rfU_2.id_class((Random)ThreadLocalRandom.current()), () -> string, d, id_32);
    }

    public ix_3(UUID uUID, Supplier<String> supplier, double d, id_3 id_32) {
        this.id_throws = uUID;
        this.id_protected = supplier;
        this.id_break = d;
        this.id_byte = id_32;
    }

    public ix_3(UUID uUID, String string, double d, id_3 id_32) {
        this(uUID, () -> string, d, id_32);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            ix_3 ix_32 = (ix_3)object;
            return Objects.equals(this.id_throws, ix_32.id_throws);
        }
        return false;
    }

    public String toString() {
        return "AttributeModifier{amount=" + this.id_break + ", operation=" + this.id_byte + ", name='" + this.id_protected.get() + "', id=" + this.id_throws + "}";
    }

    public int hashCode() {
        return this.id_throws.hashCode();
    }

    public static ix_3 id_class(rcd_3 rcd_32) {
        try {
            UUID uUID = rcd_32.id_class("UUID");
            id_3 id_32 = id_3.id_class(rcd_32.id_private("Operation"));
            return new ix_3(uUID, rcd_32.id_native("Name"), rcd_32.id_extends("Amount"), id_32);
        }
        catch (Exception exception) {
            id_class.warn("Unable to create attribute: {}", (Object)exception.getMessage());
            return null;
        }
    }

    public UUID id_class() {
        return this.id_throws;
    }

    public String id_break() {
        return this.id_protected.get();
    }

    public rcd_3 id_throws() {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("Name", this.id_break());
        rcd_32.id_class("Amount", this.id_break);
        rcd_32.id_break("Operation", this.id_byte.id_class());
        rcd_32.id_class("UUID", this.id_throws);
        return rcd_32;
    }

    public double id_protected() {
        return this.id_break;
    }
}


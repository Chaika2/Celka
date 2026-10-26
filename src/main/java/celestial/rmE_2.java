/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.an_3;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rmG_2;
import celestial.rmb_3;
import celestial.rrWr_1;
import celestial.rut_3;
import celestial.ruu_3;
import celestial.ruw_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rmE_2 {
    private static final Logger id_byte = LogManager.getLogger();
    private static final Map<Class<? extends an_3>, Integer> id_protected = Maps.newHashMap();
    private final an_3 id_throws;
    private final Map<Integer, rmG_2<?>> id_case = Maps.newHashMap();
    private final ReadWriteLock id_catch = new ReentrantReadWriteLock();
    private boolean id_private = true;
    private boolean id_implements;
    public rYG id_class = rrWr_1.id_class;
    public rfH_2 id_break = rfH_2.id_protected;

    private <T> void id_byte(rut_3<T> rut_32, T t) {
        rmG_2<T> rmG_22 = new rmG_2<T>(rut_32, t);
        this.id_catch.writeLock().lock();
        this.id_case.put(rut_32.id_class(), rmG_22);
        this.id_private = false;
        this.id_catch.writeLock().unlock();
    }

    public List<rmG_2<?>> id_byte() {
        ArrayList arrayList = null;
        this.id_catch.readLock().lock();
        for (rmG_2<?> rmG_22 : this.id_case.values()) {
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            arrayList.add(rmG_22.id_protected());
        }
        this.id_catch.readLock().unlock();
        return arrayList;
    }

    public rmE_2(an_3 an_32) {
        this.id_throws = an_32;
    }

    public <T> void id_class(rut_3<T> rut_32, T t) {
        int n = rut_32.id_class();
        if (n > 254) {
            throw new IllegalArgumentException("Data value id is too big with " + n + "! (Max is 254)");
        }
        if (this.id_case.containsKey(n)) {
            throw new IllegalArgumentException("Duplicate id value for " + n + "!");
        }
        if (ruw_3.id_break(rut_32.id_break()) < 0) {
            throw new IllegalArgumentException("Unregistered serializer " + rut_32.id_break() + " for " + n + "!");
        }
        this.id_byte(rut_32, t);
    }

    public static <T> rut_3<T> id_class(Class<? extends an_3> clazz, rmb_3<T> rmb_32) {
        int n;
        if (id_byte.isDebugEnabled()) {
            try {
                Class<?> clazz2 = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
                if (!clazz2.equals(clazz)) {
                    id_byte.debug("defineId called for: {} from {}", clazz, clazz2, (Object)new RuntimeException());
                }
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
        }
        if (id_protected.containsKey(clazz)) {
            n = id_protected.get(clazz) + 1;
        } else {
            int n2 = 0;
            Class<? extends an_3> clazz3 = clazz;
            while (clazz3 != an_3.class) {
                if (!id_protected.containsKey(clazz3 = clazz3.getSuperclass())) continue;
                n2 = id_protected.get(clazz3) + 1;
                break;
            }
            n = n2;
        }
        if (n > 254) {
            throw new IllegalArgumentException("Data value id is too big with " + n + "! (Max is 254)");
        }
        id_protected.put(clazz, n);
        return rmb_32.id_class(n);
    }

    private <T> void id_class(rmG_2<T> rmG_22, rmG_2<?> rmG_23) {
        if (!Objects.equals(rmG_23.id_class.id_break(), rmG_22.id_class.id_break())) {
            throw new IllegalStateException(String.format("Invalid entity data item type for field %d on entity %s: old=%s(%s), new=%s(%s)", rmG_22.id_class.id_class(), this.id_throws, rmG_22.id_break, rmG_22.id_break.getClass(), rmG_23.id_break, rmG_23.id_break.getClass()));
        }
        rmG_22.id_class(rmG_23.id_break());
    }

    public static List<rmG_2<?>> id_class(ruu_3 ruu_32) throws IOException {
        short s;
        ArrayList arrayList = null;
        while ((s = ruu_32.readUnsignedByte()) != 255) {
            int n;
            rmb_3<?> rmb_32;
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            if ((rmb_32 = ruw_3.id_class(n = ruu_32.id_case())) == null) {
                throw new DecoderException("Unknown serializer type " + n);
            }
            arrayList.add(rmE_2.id_class(ruu_32, s, rmb_32));
        }
        return arrayList;
    }

    private static <T> rmG_2<T> id_class(ruu_3 ruu_32, int n, rmb_3<T> rmb_32) {
        return new rmG_2<T>(rmb_32.id_class(n), rmb_32.id_break(ruu_32));
    }

    public void id_class(List<rmG_2<?>> list) {
        this.id_catch.writeLock().lock();
        for (rmG_2<?> rmG_22 : list) {
            rmG_2<?> rmG_23 = this.id_case.get(rmG_22.id_class().id_class());
            if (rmG_23 == null) continue;
            this.id_class(rmG_23, rmG_22);
            this.id_throws.id_class(rmG_22.id_class());
        }
        this.id_catch.writeLock().unlock();
        this.id_implements = true;
    }

    public <T> T id_class(rut_3<T> rut_32) {
        return this.id_break(rut_32).id_break();
    }

    private static <T> void id_class(ruu_3 ruu_32, rmG_2<T> rmG_22) throws IOException {
        rut_3<T> rut_32 = rmG_22.id_class();
        int n = ruw_3.id_break(rut_32.id_break());
        if (n < 0) {
            throw new EncoderException("Unknown serializer type " + rut_32.id_break());
        }
        ruu_32.writeByte(rut_32.id_class());
        ruu_32.id_protected(n);
        rut_32.id_break().id_class(ruu_32, rmG_22.id_break());
    }

    public boolean id_class() {
        return this.id_implements;
    }

    public static void id_class(List<rmG_2<?>> list, ruu_3 ruu_32) throws IOException {
        if (list != null) {
            int n = list.size();
            for (int i = 0; i < n; ++i) {
                rmE_2.id_class(ruu_32, list.get(i));
            }
        }
        ruu_32.writeByte(255);
    }

    public List<rmG_2<?>> id_break() {
        ArrayList arrayList = null;
        if (this.id_implements) {
            this.id_catch.readLock().lock();
            for (rmG_2<?> rmG_22 : this.id_case.values()) {
                if (!rmG_22.id_byte()) continue;
                rmG_22.id_class(false);
                if (arrayList == null) {
                    arrayList = Lists.newArrayList();
                }
                arrayList.add(rmG_22.id_protected());
            }
            this.id_catch.readLock().unlock();
        }
        this.id_implements = false;
        return arrayList;
    }

    public <T> void id_break(rut_3<T> rut_32, T t) {
        rmG_2<T> rmG_22 = this.id_break(rut_32);
        if (ObjectUtils.notEqual(t, rmG_22.id_break())) {
            rmG_22.id_class(t);
            this.id_throws.id_class(rut_32);
            rmG_22.id_class(true);
            this.id_implements = true;
        }
    }

    private <T> rmG_2<T> id_break(rut_3<T> rut_32) {
        rmG_2<?> rmG_22;
        this.id_catch.readLock().lock();
        try {
            rmG_22 = this.id_case.get(rut_32.id_class());
        }
        catch (Throwable throwable) {
            KY kY = KY.id_class(throwable, "Getting synched entity data");
            Ko_1 ko_1 = kY.id_class("Synched entity data");
            ko_1.id_class("Data ID", rut_32);
            throw new KU(kY);
        }
        finally {
            this.id_catch.readLock().unlock();
        }
        return rmG_22;
    }

    public void id_throws() {
        this.id_implements = false;
        this.id_catch.readLock().lock();
        for (rmG_2<?> rmG_22 : this.id_case.values()) {
            rmG_22.id_class(false);
        }
        this.id_catch.readLock().unlock();
    }

    public boolean id_protected() {
        return this.id_private;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.rVE;
import celestial.rVG;
import celestial.rVO;
import celestial.rVS;
import celestial.rVs_1;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rfU_2;
import celestial.rqE_2;
import celestial.ruu_3;
import celestial.ryl_3;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class rVM<T>
implements rVG<T> {
    private final rVE<T> id_break;
    private final rVG<T> id_byte = (n, object) -> 0;
    private final rqE_2<T> id_protected;
    private final Function<rcd_3, T> id_throws;
    private final Function<T, rcd_3> id_case;
    private final T id_catch;
    protected ryl_3 id_class;
    private rVE<T> id_private;
    private int id_implements;
    private final ReentrantLock id_finally = new ReentrantLock();

    public int id_byte() {
        return 1 + this.id_private.id_class() + ruu_3.id_class(this.id_class.id_break()) + this.id_class.id_class().length * 8;
    }

    public rVM(rVE<T> rVE2, rqE_2<T> rqE_22, Function<rcd_3, T> function, Function<T, rcd_3> function2, T t) {
        this.id_break = rVE2;
        this.id_protected = rqE_22;
        this.id_throws = function;
        this.id_case = function2;
        this.id_catch = t;
        this.id_break(4);
    }

    public boolean id_class(Predicate<T> predicate) {
        return this.id_private.id_class(predicate);
    }

    public void id_class(rcd_3 rcd_32, String string, String string2) {
        this.id_class();
        rVs_1<T> rVs_12 = new rVs_1<T>(this.id_protected, this.id_implements, this.id_byte, this.id_throws, this.id_case);
        T t = this.id_catch;
        int n = rVs_12.id_class(this.id_catch);
        int[] nArray = new int[4096];
        for (int i = 0; i < 4096; ++i) {
            T t2 = this.id_class(i);
            if (t2 != t) {
                t = t2;
                n = rVs_12.id_class(t2);
            }
            nArray[i] = n;
        }
        rcy_3 rcy_32 = new rcy_3();
        rVs_12.id_break(rcy_32);
        rcd_32.id_class(string, rcy_32);
        int n2 = Math.max(4, rfU_2.id_throws(rcy_32.size()));
        ryl_3 ryl_32 = new ryl_3(n2, 4096);
        for (int i = 0; i < nArray.length; ++i) {
            ryl_32.id_break(i, nArray[i]);
        }
        rcd_32.id_class(string2, ryl_32.id_class());
        this.id_break();
    }

    public void id_class(rcy_3 rcy_32, long[] lArray) {
        this.id_class();
        int n = Math.max(4, rfU_2.id_throws(rcy_32.size()));
        if (n != this.id_implements) {
            this.id_break(n);
        }
        this.id_private.id_class(rcy_32);
        int n2 = lArray.length * 64 / 4096;
        if (this.id_private == this.id_break) {
            rVs_1<T> rVs_12 = new rVs_1<T>(this.id_protected, n, this.id_byte, this.id_throws, this.id_case);
            rVs_12.id_class(rcy_32);
            ryl_3 ryl_32 = new ryl_3(n, 4096, lArray);
            for (int i = 0; i < 4096; ++i) {
                this.id_class.id_break(i, this.id_break.id_class(rVs_12.id_class(ryl_32.id_class(i))));
            }
        } else if (n2 == this.id_implements) {
            System.arraycopy(lArray, 0, this.id_class.id_class(), 0, lArray.length);
        } else {
            ryl_3 ryl_33 = new ryl_3(n2, 4096, lArray);
            for (int i = 0; i < 4096; ++i) {
                this.id_class.id_break(i, ryl_33.id_class(i));
            }
        }
        this.id_break();
    }

    public void id_class(ruu_3 ruu_32) {
        this.id_class();
        byte by = ruu_32.readByte();
        if (this.id_implements != by) {
            this.id_break(by);
        }
        this.id_private.id_class(ruu_32);
        ruu_32.id_break(this.id_class.id_class());
        this.id_break();
    }

    public void id_class() {
        if (this.id_finally.isLocked() && !this.id_finally.isHeldByCurrentThread()) {
            String string = Thread.getAllStackTraces().keySet().stream().filter(Objects::nonNull).map(thread -> thread.getName() + ": \n\tat " + Arrays.stream(thread.getStackTrace()).map(Object::toString).collect(Collectors.joining("\n\tat "))).collect(Collectors.joining("\n"));
            KY kY = new KY("Writing into PalettedContainer from multiple threads", new IllegalStateException());
            Ko_1 ko_1 = kY.id_class("Thread dumps");
            ko_1.id_class("Thread dumps", string);
            throw new KU(kY);
        }
        this.id_finally.lock();
    }

    private static /* synthetic */ void id_class(Int2IntMap int2IntMap, int n) {
        int2IntMap.put(n, int2IntMap.get(n) + 1);
    }

    public void id_class(rVO<T> rVO2) {
        Int2IntOpenHashMap int2IntOpenHashMap = new Int2IntOpenHashMap();
        this.id_class.id_class(arg_0 -> rVM.id_class((Int2IntMap)int2IntOpenHashMap, arg_0));
        int2IntOpenHashMap.int2IntEntrySet().forEach(entry -> rVO2.accept(this.id_private.id_class(entry.getIntKey()), entry.getIntValue()));
    }

    protected T id_class(int n, T t) {
        int n2 = this.id_private.id_class(t);
        int n3 = this.id_class.id_class(n, n2);
        T t2 = this.id_private.id_class(n3);
        return t2 == null ? this.id_catch : t2;
    }

    public T id_class(int n, int n2, int n3, T t) {
        this.id_class();
        T t2 = this.id_class(rVM.id_break(n, n2, n3), t);
        this.id_break();
        return t2;
    }

    public T id_class(int n, int n2, int n3) {
        return this.id_class(rVM.id_break(n, n2, n3));
    }

    public T id_class(int n) {
        T t = this.id_private.id_class(this.id_class.id_class(n));
        return t == null ? this.id_catch : t;
    }

    private static int id_break(int n, int n2, int n3) {
        return n2 << 8 | n3 << 4 | n;
    }

    private void id_break(int n) {
        if (n != this.id_implements) {
            this.id_implements = n;
            if (this.id_implements <= 4) {
                this.id_implements = 4;
                this.id_private = new rVS<T>(this.id_protected, this.id_implements, this, this.id_throws);
            } else if (this.id_implements < 9) {
                this.id_private = new rVs_1<T>(this.id_protected, this.id_implements, this, this.id_throws, this.id_case);
            } else {
                this.id_private = this.id_break;
                this.id_implements = rfU_2.id_throws(this.id_protected.id_class());
            }
            this.id_private.id_class(this.id_catch);
            this.id_class = new ryl_3(this.id_implements, 4096);
        }
    }

    public void id_break() {
        this.id_finally.unlock();
    }

    public void id_break(ruu_3 ruu_32) {
        this.id_class();
        ruu_32.writeByte(this.id_implements);
        this.id_private.id_break(ruu_32);
        ruu_32.id_class(this.id_class.id_class());
        this.id_break();
    }

    public T id_break(int n, int n2, int n3, T t) {
        return this.id_class(rVM.id_break(n, n2, n3), t);
    }

    protected void id_break(int n, T t) {
        int n2 = this.id_private.id_class(t);
        this.id_class.id_break(n, n2);
    }

    @Override
    public int onResize(int n, T t) {
        int n2;
        this.id_class();
        ryl_3 ryl_32 = this.id_class;
        rVE<T> rVE2 = this.id_private;
        this.id_break(n);
        for (n2 = 0; n2 < ryl_32.id_break(); ++n2) {
            T t2 = rVE2.id_class(ryl_32.id_class(n2));
            if (t2 == null) continue;
            this.id_break(n2, t2);
        }
        n2 = this.id_private.id_class(t);
        this.id_break();
        return n2;
    }
}


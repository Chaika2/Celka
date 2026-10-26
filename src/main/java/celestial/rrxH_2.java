/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.MT;
import celestial.ju_3;
import celestial.rrWR;
import celestial.rrbb_3;
import celestial.rrdL;
import celestial.rrxl_3;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class rrxH_2 {
    private HU id_class = null;
    private int id_break = MT.id_new();
    private int id_byte = 4096;
    private int id_protected = 0;
    private int id_throws;
    private rrWR<rrxl_3> id_case = new rrWR();
    private rrxl_3 id_catch = null;
    private IntBuffer id_private = rrbb_3.id_break(this.id_byte);
    private IntBuffer id_implements = rrbb_3.id_break(this.id_byte);
    private final int id_finally = ju_3.id_private.id_break();
    private int id_extends = 7;
    private boolean id_native = rrbb_3.rs();

    private void id_byte(int n) {
        int n2 = this.id_byte * 6 / 4;
        while (n2 < n) {
            n2 = n2 * 6 / 4;
        }
        long l = this.id_protected(this.id_byte);
        long l2 = this.id_protected(n2);
        int n3 = MT.id_new();
        MT.id_catch(MT.id_catch, n3);
        MT.id_class(MT.id_catch, l2, MT.id_private);
        rrbb_3.id_catch("Expand VBO");
        MT.id_catch(MT.id_catch, 0);
        MT.id_catch(MT.id_throws, this.id_break);
        MT.id_catch(MT.id_case, n3);
        MT.id_class(MT.id_throws, MT.id_case, 0L, 0L, l);
        rrbb_3.id_catch("Copy VBO: " + l2);
        MT.id_catch(MT.id_throws, 0);
        MT.id_catch(MT.id_case, 0);
        MT.id_finally(this.id_break);
        this.id_private = rrbb_3.id_break(n2);
        this.id_implements = rrbb_3.id_break(n2);
        this.id_break = n3;
        this.id_byte = n2;
    }

    public void id_byte() {
        MT.id_catch(MT.id_catch, 0);
    }

    public rrxH_2(HU hU) {
        this.id_class = hU;
        this.id_class();
        long l = this.id_protected(this.id_byte);
        MT.id_class(MT.id_catch, l, MT.id_private);
        this.id_byte();
    }

    private int id_class(long l) {
        return (int)(l / (long)this.id_finally);
    }

    public void id_class() {
        MT.id_catch(MT.id_catch, this.id_break);
    }

    public void id_class(int n, rrxl_3 rrxl_32) {
        if (this.id_extends != n) {
            if (this.id_private.position() > 0) {
                throw new IllegalArgumentException("Mixed region draw modes: " + this.id_extends + " != " + n);
            }
            this.id_extends = n;
        }
        this.id_private.put(rrxl_32.id_class());
        this.id_implements.put(rrxl_32.id_break());
    }

    public void id_class(ByteBuffer byteBuffer, rrxl_3 rrxl_32) {
        if (this.id_break >= 0) {
            int n = rrxl_32.id_class();
            int n2 = rrxl_32.id_break();
            int n3 = this.id_class((long)byteBuffer.limit());
            if (n3 <= 0) {
                if (n >= 0) {
                    rrxl_32.id_class(-1);
                    rrxl_32.id_break(0);
                    this.id_case.id_byte(rrxl_32.id_protected());
                    this.id_throws -= n2;
                }
            } else {
                if (n3 > n2) {
                    rrxl_32.id_class(this.id_protected);
                    rrxl_32.id_break(n3);
                    this.id_protected += n3;
                    if (n >= 0) {
                        this.id_case.id_byte(rrxl_32.id_protected());
                    }
                    this.id_case.id_break(rrxl_32.id_protected());
                }
                rrxl_32.id_break(n3);
                this.id_throws += n3 - n2;
                this.id_break(rrxl_32.id_byte());
                long l = this.id_protected(rrxl_32.id_class());
                this.id_class();
                MT.id_class(MT.id_catch, l, byteBuffer);
                this.id_byte();
                if (this.id_protected > this.id_throws * 11 / 10) {
                    this.id_class(1);
                }
            }
        }
    }

    private void id_class(int n) {
        if (!this.id_case.id_throws()) {
            rrxl_3 rrxl_32 = this.id_catch;
            if (rrxl_32 == null || !this.id_case.id_protected(rrxl_32.id_protected())) {
                rrxl_32 = this.id_case.id_break().id_class();
            }
            int n2 = rrxl_32.id_class();
            rrxl_3 rrxl_33 = rrxl_32.id_throws();
            n2 = rrxl_33 == null ? 0 : rrxl_33.id_byte();
            for (int i = 0; rrxl_32 != null && i < n; ++i) {
                if (rrxl_32.id_class() == n2) {
                    n2 += rrxl_32.id_break();
                    rrxl_32 = rrxl_32.id_case();
                    continue;
                }
                int n3 = rrxl_32.id_class() - n2;
                if (rrxl_32.id_break() <= n3) {
                    this.id_class(rrxl_32.id_class(), n2, rrxl_32.id_break());
                    rrxl_32.id_class(n2);
                    n2 += rrxl_32.id_break();
                    rrxl_32 = rrxl_32.id_case();
                    continue;
                }
                this.id_break(this.id_protected + rrxl_32.id_break());
                this.id_class(rrxl_32.id_class(), this.id_protected, rrxl_32.id_break());
                rrxl_32.id_class(this.id_protected);
                this.id_protected += rrxl_32.id_break();
                rrxl_3 rrxl_34 = rrxl_32.id_case();
                this.id_case.id_byte(rrxl_32.id_protected());
                this.id_case.id_break(rrxl_32.id_protected());
                rrxl_32 = rrxl_34;
            }
            if (rrxl_32 == null) {
                this.id_protected = this.id_case.id_byte().id_class().id_byte();
            }
            this.id_catch = rrxl_32;
        }
    }

    private void id_class(int n, int n2, int n3) {
        long l = this.id_protected(n);
        long l2 = this.id_protected(n2);
        long l3 = this.id_protected(n3);
        MT.id_catch(MT.id_throws, this.id_break);
        MT.id_catch(MT.id_case, this.id_break);
        MT.id_class(MT.id_throws, MT.id_case, l, l2, l3);
        rrbb_3.id_catch("Copy VBO range");
        MT.id_catch(MT.id_throws, 0);
        MT.id_catch(MT.id_case, 0);
    }

    private void id_break(int n) {
        if (this.id_byte < n) {
            this.id_byte(n);
        }
    }

    public void id_break() {
        this.id_class();
        ju_3.id_private.id_class(0L);
        if (this.id_native) {
            rrdL.id_package();
        }
        ((Buffer)this.id_private).flip();
        ((Buffer)this.id_implements).flip();
        MT.id_class(this.id_extends, this.id_private, this.id_implements);
        ((Buffer)this.id_private).limit(this.id_private.capacity());
        ((Buffer)this.id_implements).limit(this.id_implements.capacity());
        if (this.id_protected > this.id_throws * 11 / 10) {
            this.id_class(1);
        }
    }

    public int id_throws() {
        return this.id_protected;
    }

    private void id_case() {
        int n = 0;
        int n2 = 0;
        for (rrxl_3 rrxl_32 = this.id_case.id_break().id_class(); rrxl_32 != null; rrxl_32 = rrxl_32.id_case()) {
            ++n;
            n2 += rrxl_32.id_break();
            if (rrxl_32.id_class() < 0 || rrxl_32.id_break() <= 0 || rrxl_32.id_byte() > this.id_protected) {
                throw new RuntimeException("Invalid range: " + rrxl_32);
            }
            rrxl_3 rrxl_33 = rrxl_32.id_throws();
            if (rrxl_33 != null && rrxl_32.id_class() < rrxl_33.id_byte()) {
                throw new RuntimeException("Invalid range: " + rrxl_32);
            }
            rrxl_3 rrxl_34 = rrxl_32.id_case();
            if (rrxl_34 == null || rrxl_32.id_byte() <= rrxl_34.id_class()) continue;
            throw new RuntimeException("Invalid range: " + rrxl_32);
        }
        if (n != this.id_case.id_protected()) {
            throw new RuntimeException("Invalid count: " + n + " <> " + this.id_case.id_protected());
        }
        if (n2 != this.id_throws) {
            throw new RuntimeException("Invalid size: " + n2 + " <> " + this.id_throws);
        }
    }

    private long id_protected(int n) {
        return (long)n * (long)this.id_finally;
    }

    public void id_protected() {
        if (this.id_break >= 0) {
            MT.id_finally(this.id_break);
            this.id_break = -1;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
package celestial;

import celestial.NB;
import celestial.ND;
import celestial.NI;
import celestial.NJ;
import celestial.NK;
import celestial.NN;
import celestial.NP;
import celestial.NQ;
import celestial.NX;
import celestial.NZ;
import celestial.Nf_1;
import celestial.Ni_1;
import celestial.Nm_1;
import celestial.Nq_1;
import celestial.Nu_1;
import celestial.Nw_1;
import celestial.Nz_1;
import celestial.Qw_1;
import celestial.ly_3;
import celestial.rAL;
import celestial.rVL;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rje_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqO_2;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Nt_1 {
    private static final Marker id_class = MarkerManager.getMarker((String)"SOUNDS");
    private static final Logger id_break = LogManager.getLogger();
    private static final Set<rqO_2> id_byte = Sets.newHashSet();
    private final Nf_1 id_protected;
    private final Qw_1 id_throws;
    private boolean id_case;
    private final ND id_catch = new ND();
    private final NZ id_private = this.id_catch.id_byte();
    private final NB id_implements;
    private final Nw_1 id_finally = new Nw_1();
    private final NX id_extends = new NX(this.id_catch, this.id_finally);
    private int id_native;
    private final Map<NQ, NJ> id_volatile = Maps.newHashMap();
    private final Multimap<rqL_2, NQ> id_final = HashMultimap.create();
    private final List<Nm_1> id_package = Lists.newArrayList();
    private final Map<NQ, Integer> id_int = Maps.newHashMap();
    private final Map<NQ, Integer> id_new = Maps.newHashMap();
    private final List<Nu_1> id_continue = Lists.newArrayList();
    private final List<Nm_1> id_super = Lists.newArrayList();
    private final List<Nq_1> id_this = Lists.newArrayList();

    public void id_byte() {
        if (this.id_case) {
            this.id_finally.id_break();
            this.id_volatile.values().forEach(nJ -> nJ.id_class(NK::id_case));
            this.id_volatile.clear();
            this.id_extends.id_break();
            this.id_int.clear();
            this.id_package.clear();
            this.id_final.clear();
            this.id_new.clear();
            this.id_super.clear();
        }
    }

    public void id_byte(NQ nQ) {
        if (this.id_case && nQ.id_throws()) {
            NI nI = nQ.id_class(this.id_protected);
            rqO_2 rqO_22 = nQ.id_case();
            if (nI == null) {
                if (id_byte.add(rqO_22)) {
                    id_break.warn(id_class, "Unable to play unknown soundEvent: {}", (Object)rqO_22);
                }
            } else {
                Nq_1 nq_1 = nQ.id_catch();
                if (nq_1 == Nf_1.id_class) {
                    if (id_byte.add(rqO_22)) {
                        id_break.warn(id_class, "Unable to play empty soundEvent: {}", (Object)rqO_22);
                    }
                } else {
                    float f = nQ.id_native();
                    float f2 = Math.max(f, 1.0f) * (float)nq_1.id_extends();
                    rqL_2 rqL_22 = nQ.id_private();
                    float f3 = this.id_private(nQ);
                    float f4 = this.id_catch(nQ);
                    NN nN = nQ.id_new();
                    boolean bl = nQ.id_finally();
                    if (f3 == 0.0f && !nQ.id_protected()) {
                        id_break.debug(id_class, "Skipped playing sound {}, volume was zero.", (Object)nq_1.id_byte());
                    } else {
                        boolean bl2;
                        rjU_2 rjU_22 = new rjU_2(nQ.id_final(), nQ.id_package(), nQ.id_int());
                        if (!this.id_continue.isEmpty()) {
                            boolean bl3 = bl2 = bl || nN == NN.NONE || this.id_private.id_class().id_implements(rjU_22) < (double)(f2 * f2);
                            if (bl2) {
                                for (Nu_1 completableFuture : this.id_continue) {
                                    completableFuture.id_class(nQ, nI);
                                }
                            } else {
                                id_break.debug(id_class, "Did not notify listeners of soundEvent: {}, it is too far away to hear", (Object)rqO_22);
                            }
                        }
                        if (this.id_private.id_break() <= 0.0f) {
                            id_break.debug(id_class, "Skipped playing soundEvent: {}, master volume was zero", (Object)rqO_22);
                        } else {
                            bl2 = Nt_1.id_case(nQ);
                            boolean bl4 = nq_1.id_implements();
                            CompletableFuture<NJ> completableFuture = this.id_extends.id_class(nq_1.id_implements() ? Ni_1.STREAMING : Ni_1.STATIC);
                            NJ nJ = completableFuture.join();
                            if (nJ != null) {
                                id_break.debug(id_class, "Playing sound {} for event {}", (Object)nq_1.id_byte(), (Object)rqO_22);
                                this.id_new.put(nQ, this.id_native + 20);
                                this.id_volatile.put(nQ, nJ);
                                this.id_final.put((Object)rqL_22, (Object)nQ);
                                nJ.id_class((NK nK) -> {
                                    nK.id_class(f4);
                                    nK.id_break(f3);
                                    if (nN == NN.LINEAR) {
                                        nK.id_byte(f2);
                                    } else {
                                        nK.id_private();
                                    }
                                    nK.id_class(bl2 && !bl4);
                                    nK.id_class(rjU_22);
                                    nK.id_break(bl);
                                });
                                if (!bl4) {
                                    this.id_implements.id_class(nq_1.id_protected()).thenAccept(nP -> nJ.id_class((NK nK) -> {
                                        nK.id_class((NP)nP);
                                        nK.id_byte();
                                    }));
                                } else {
                                    this.id_implements.id_class(nq_1.id_protected(), bl2).thenAccept(nz_1 -> nJ.id_class((NK nK) -> {
                                        nK.id_class((Nz_1)nz_1);
                                        nK.id_byte();
                                    }));
                                }
                                if (nQ instanceof Nm_1) {
                                    this.id_package.add((Nm_1)nQ);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public Nt_1(Nf_1 nf_1, Qw_1 qw_1, rAL rAL2) {
        this.id_protected = nf_1;
        this.id_throws = qw_1;
        this.id_implements = new NB(rAL2);
    }

    public void id_class() {
        id_byte.clear();
        for (rqA_2 rqA_22 : rVL.id_short) {
            rqO_2 rqO_22 = rqA_22.id_class();
            if (this.id_protected.id_class(rqO_22) != null) continue;
            id_break.warn("Missing sound for event: {}", (Object)rVL.id_short.id_break(rqA_22));
            id_byte.add(rqO_22);
        }
        this.id_break();
        this.id_catch();
    }

    public void id_class(Nq_1 nq_1) {
        this.id_this.add(nq_1);
    }

    public void id_class(Nm_1 nm_1) {
        this.id_super.add(nm_1);
    }

    public void id_class(rqO_2 rqO_22, rqL_2 rqL_22) {
        if (rqL_22 != null) {
            for (NQ nQ : this.id_final.get((Object)rqL_22)) {
                if (rqO_22 != null && !nQ.id_case().equals(rqO_22)) continue;
                this.id_class(nQ);
            }
        } else if (rqO_22 == null) {
            this.id_byte();
        } else {
            for (NQ nQ : this.id_volatile.keySet()) {
                if (!nQ.id_case().equals(rqO_22)) continue;
                this.id_class(nQ);
            }
        }
    }

    public void id_class(ly_3 ly_32) {
        if (this.id_case && ly_32.id_private()) {
            rjU_2 rjU_22 = ly_32.id_break();
            rje_3 rje_32 = ly_32.id_volatile();
            rje_3 rje_33 = ly_32.id_final();
            this.id_finally.execute(() -> {
                this.id_private.id_class(rjU_22);
                this.id_private.id_class(rje_32, rje_33);
            });
        }
    }

    public void id_class(NQ nQ, int n) {
        this.id_int.put(nQ, this.id_native + n);
    }

    public void id_class(NQ nQ) {
        NJ nJ;
        if (this.id_case && (nJ = this.id_volatile.get(nQ)) != null) {
            nJ.id_class(NK::id_case);
        }
    }

    public void id_class(rqL_2 rqL_22, float f) {
        if (this.id_case) {
            if (rqL_22 == rqL_2.MASTER) {
                this.id_private.id_class(f);
            } else {
                this.id_volatile.forEach((nQ, nJ) -> {
                    float f = this.id_private((NQ)nQ);
                    nJ.id_class((NK nK) -> {
                        if (f <= 0.0f) {
                            nK.id_case();
                        } else {
                            nK.id_break(f);
                        }
                    });
                });
            }
        }
    }

    public void id_class(Nu_1 nu_1) {
        this.id_continue.add(nu_1);
    }

    private float id_class(rqL_2 rqL_22) {
        return rqL_22 != null && rqL_22 != rqL_2.MASTER ? this.id_throws.id_class(rqL_22) : 1.0f;
    }

    public void id_class(boolean bl) {
        if (!bl) {
            this.id_private();
        }
        this.id_extends.id_class();
    }

    public void id_break() {
        if (this.id_case) {
            this.id_byte();
            this.id_implements.id_class();
            this.id_catch.id_break();
            this.id_case = false;
        }
    }

    public void id_break(Nu_1 nu_1) {
        this.id_continue.remove(nu_1);
    }

    public boolean id_break(NQ nQ) {
        if (!this.id_case) {
            return false;
        }
        return this.id_new.containsKey(nQ) && this.id_new.get(nQ) <= this.id_native ? true : this.id_volatile.containsKey(nQ);
    }

    private static boolean id_throws(NQ nQ) {
        return nQ.id_implements() && Nt_1.id_protected(nQ);
    }

    public void id_throws() {
        if (this.id_case) {
            this.id_extends.id_class((Stream<NK> stream) -> stream.forEach(NK::id_throws));
        }
    }

    private float id_catch(NQ nQ) {
        return rfU_2.id_class(nQ.id_volatile(), 0.5f, 2.0f);
    }

    private synchronized void id_catch() {
        if (!this.id_case) {
            try {
                this.id_catch.id_class();
                this.id_private.id_byte();
                this.id_private.id_class(this.id_throws.id_class(rqL_2.MASTER));
                this.id_implements.id_class(this.id_this).thenRun(this.id_this::clear);
                this.id_case = true;
                id_break.info(id_class, "Sound engine started");
            }
            catch (RuntimeException runtimeException) {
                id_break.error(id_class, "Error starting SoundSystem. Turning off sounds & music", (Throwable)runtimeException);
            }
        }
    }

    private static boolean id_case(NQ nQ) {
        return nQ.id_implements() && !Nt_1.id_protected(nQ);
    }

    public String id_case() {
        return this.id_catch.id_protected();
    }

    private static boolean id_protected(NQ nQ) {
        return nQ.id_extends() > 0;
    }

    public void id_protected() {
        if (this.id_case) {
            this.id_extends.id_class((Stream<NK> stream) -> stream.forEach(NK::id_protected));
        }
    }

    private void id_private() {
        ++this.id_native;
        this.id_super.stream().filter(NQ::id_throws).forEach(this::id_byte);
        this.id_super.clear();
        for (Nm_1 object2 : this.id_package) {
            if (!object2.id_throws()) {
                this.id_class((NQ)object2);
            }
            object2.id_byte();
            if (object2.id_continue()) {
                this.id_class((NQ)object2);
                continue;
            }
            float f = this.id_private(object2);
            float f2 = this.id_catch(object2);
            rjU_2 rjU_22 = new rjU_2(object2.id_final(), object2.id_package(), object2.id_int());
            NJ nJ = this.id_volatile.get(object2);
            if (nJ == null) continue;
            nJ.id_class((NK nK) -> {
                nK.id_break(f);
                nK.id_class(f2);
                nK.id_class(rjU_22);
            });
        }
        Iterator<Object> iterator = this.id_volatile.entrySet().iterator();
        while (iterator.hasNext()) {
            int n;
            Map.Entry entry = (Map.Entry)iterator.next();
            NJ nJ = (NJ)entry.getValue();
            NQ nQ = (NQ)entry.getKey();
            float f = this.id_throws.id_class(nQ.id_private());
            if (f <= 0.0f) {
                nJ.id_class(NK::id_case);
                iterator.remove();
                continue;
            }
            if (!nJ.id_class() || (n = this.id_new.get(nQ).intValue()) > this.id_native) continue;
            if (Nt_1.id_throws(nQ)) {
                this.id_int.put(nQ, this.id_native + nQ.id_extends());
            }
            iterator.remove();
            id_break.debug(id_class, "Removed channel {} because it's not playing anymore", (Object)nJ);
            this.id_new.remove(nQ);
            try {
                this.id_final.remove((Object)nQ.id_private(), (Object)nQ);
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            if (!(nQ instanceof Nm_1)) continue;
            this.id_package.remove(nQ);
        }
        Iterator<Map.Entry<NQ, Integer>> iterator2 = this.id_int.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<NQ, Integer> entry = iterator2.next();
            if (this.id_native < entry.getValue()) continue;
            NQ nQ = entry.getKey();
            if (nQ instanceof Nm_1) {
                ((Nm_1)nQ).id_byte();
            }
            this.id_byte(nQ);
            iterator2.remove();
        }
    }

    private float id_private(NQ nQ) {
        return rfU_2.id_class(nQ.id_native() * this.id_class(nQ.id_private()), 0.0f, 1.0f);
    }
}


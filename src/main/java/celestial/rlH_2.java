/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.apache.commons.io.IOUtils
 */
package celestial;

import celestial.Rd_1;
import celestial.an_3;
import celestial.rCD;
import celestial.rHZ;
import celestial.rKQ;
import celestial.rVL;
import celestial.rcH_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rpa_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.rrPl_1;
import celestial.rrPt_1;
import celestial.ryG_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.apache.commons.io.IOUtils;

public class rlH_2 {
    public static String id_class = "gameteststructures";

    public static Collection<rfH_2> id_byte(rfH_2 rfH_22, int n, rrEm_1 rrEm_12) {
        ArrayList arrayList = Lists.newArrayList();
        rfl_3 rfl_32 = new rfl_3(rfH_22);
        rfl_32 = rfl_32.id_class(n);
        for (int i = (int)rfl_32.id_class; i <= (int)rfl_32.id_protected; ++i) {
            for (int j = (int)rfl_32.id_break; j <= (int)rfl_32.id_throws; ++j) {
                for (int k = (int)rfl_32.id_byte; k <= (int)rfl_32.id_case; ++k) {
                    rfH_2 rfH_23 = new rfH_2(i, j, k);
                    xc_3 xc_32 = rrEm_12.id_byte(rfH_23);
                    if (!xc_32.id_class(xu_3.Js)) continue;
                    arrayList.add(rfH_23);
                }
            }
        }
        return arrayList;
    }

    private static boolean id_class(rfH_2 rfH_22, rfH_2 rfH_23, rrEm_1 rrEm_12) {
        ryG_2 ryG_22 = (ryG_2)rrEm_12.id_class(rfH_22);
        rfl_3 rfl_32 = rlH_2.id_class(ryG_22).id_class(1.0);
        return rfl_32.id_case(rjU_2.id_class(rfH_23));
    }

    private static void id_class(int n, rfH_2 rfH_22, rrEm_1 rrEm_12) {
        Object object;
        xc_3 xc_32 = null;
        rKQ rKQ2 = rKQ.id_class(rrEm_12.id_new().id_break(rVL.n));
        if (rKQ2 instanceof rKQ) {
            object = rKQ2.id_catch();
            if (rfH_22.c_() < n && rfH_22.c_() <= ((xc_3[])object).length) {
                xc_32 = object[rfH_22.c_() - 1];
            }
        } else if (rfH_22.c_() == n - 1) {
            xc_32 = rrEm_12.id_implements(rfH_22).id_throws().id_throws().id_class();
        } else if (rfH_22.c_() < n - 1) {
            xc_32 = rrEm_12.id_implements(rfH_22).id_throws().id_throws().id_break();
        }
        if (xc_32 == null) {
            xc_32 = xu_3.id_class.id_continue();
        }
        object = new Rd_1(xc_32, Collections.emptySet(), null);
        ((Rd_1)object).id_class(rrEm_12, rfH_22, 2);
        rrEm_12.id_class(rfH_22, xc_32.id_break());
    }

    private static rcd_3 id_class(Path path) {
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(path);
            String string = IOUtils.toString((Reader)bufferedReader);
            return rcH_2.id_class(string);
        }
        catch (IOException iOException) {
            return null;
        }
        catch (CommandSyntaxException commandSyntaxException) {
            throw new RuntimeException("Error while trying to load structure " + path, commandSyntaxException);
        }
    }

    private static ryG_2 id_class(String string, rfH_2 rfH_22, rqd_3 rqd_32, rrEm_1 rrEm_12, boolean bl) {
        rrEm_12.id_break(rfH_22, xu_3.Js.id_continue());
        ryG_2 ryG_22 = (ryG_2)rrEm_12.id_class(rfH_22);
        ryG_22.id_class(rCD.LOAD);
        ryG_22.id_class(rqd_32);
        ryG_22.id_class(false);
        ryG_22.id_class(new rqO_2(string));
        ryG_22.id_class(rrEm_12, bl);
        if (ryG_22.id_extends() != rfH_2.id_protected) {
            return ryG_22;
        }
        rrPl_1 rrPl_12 = rlH_2.id_class(string, rrEm_12);
        ryG_22.id_class(rrEm_12, bl, rrPl_12);
        if (ryG_22.id_extends() == rfH_2.id_protected) {
            throw new RuntimeException("Failed to load structure " + string);
        }
        return ryG_22;
    }

    public static rqd_3 id_class(int n) {
        switch (n) {
            case 0: {
                return rqd_3.NONE;
            }
            case 1: {
                return rqd_3.CLOCKWISE_90;
            }
            case 2: {
                return rqd_3.CLOCKWISE_180;
            }
            case 3: {
                return rqd_3.COUNTERCLOCKWISE_90;
            }
        }
        throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + n);
    }

    private static void id_class(rfH_2 rfH_22, rrEm_1 rrEm_12) {
        rfj_3 rfj_32 = new rfj_3(rfH_22);
        for (int i = -1; i < 4; ++i) {
            for (int j = -1; j < 4; ++j) {
                int n = rfj_32.id_break + i;
                int n2 = rfj_32.id_byte + j;
                rrEm_12.id_class(n, n2, true);
            }
        }
    }

    public static ryG_2 id_class(String string, rfH_2 rfH_22, rqd_3 rqd_32, int n, rrEm_1 rrEm_12, boolean bl) {
        rfH_2 rfH_23;
        rfH_2 rfH_24 = rlH_2.id_class(string, rrEm_12).id_class();
        rfi_3 rfi_32 = rlH_2.id_class(rfH_22, rfH_24, rqd_32);
        if (rqd_32 == rqd_3.NONE) {
            rfH_23 = rfH_22;
        } else if (rqd_32 == rqd_3.CLOCKWISE_90) {
            rfH_23 = rfH_22.id_break(rfH_24.d_() - 1, 0, 0);
        } else if (rqd_32 == rqd_3.CLOCKWISE_180) {
            rfH_23 = rfH_22.id_break(rfH_24.b_() - 1, 0, rfH_24.d_() - 1);
        } else {
            if (rqd_32 != rqd_3.COUNTERCLOCKWISE_90) {
                throw new IllegalArgumentException("Invalid rotation: " + rqd_32);
            }
            rfH_23 = rfH_22.id_break(0, 0, rfH_24.b_() - 1);
        }
        rlH_2.id_class(rfH_22, rrEm_12);
        rlH_2.id_class(rfi_32, rfH_22.c_(), rrEm_12);
        ryG_2 ryG_22 = rlH_2.id_class(string, rfH_23, rqd_32, rrEm_12, bl);
        rrEm_12.id_synchronized().id_class(rfi_32, true, false);
        rrEm_12.id_class(rfi_32);
        return ryG_22;
    }

    public static void id_class(String string, rfH_2 rfH_22, rfH_2 rfH_23, rqd_3 rqd_32, rrEm_1 rrEm_12) {
        rfi_3 rfi_32 = rlH_2.id_class(rfH_22, rfH_23, rqd_32);
        rlH_2.id_class(rfi_32, rfH_22.c_(), rrEm_12);
        rrEm_12.id_break(rfH_22, xu_3.Js.id_continue());
        ryG_2 ryG_22 = (ryG_2)rrEm_12.id_class(rfH_22);
        ryG_22.id_class(false);
        ryG_22.id_class(new rqO_2(string));
        ryG_22.id_break(rfH_23);
        ryG_22.id_class(rCD.SAVE);
        ryG_22.id_throws(true);
    }

    public static void id_class(rfH_2 rfH_22, rfH_2 rfH_23, rqd_3 rqd_32, rrEm_1 rrEm_12) {
        rfH_2 rfH_24 = rrPl_1.id_class(rfH_22.id_break(rfH_23), rpa_3.NONE, rqd_32, rfH_22);
        rrEm_12.id_break(rfH_24, xu_3.SZ.id_continue());
        rHZ rHZ2 = (rHZ)rrEm_12.id_class(rfH_24);
        rHZ2.id_throws().id_class("test runthis");
        rfH_2 rfH_25 = rrPl_1.id_class(rfH_24.id_break(0, 0, -1), rpa_3.NONE, rqd_32, rfH_24);
        rrEm_12.id_break(rfH_25, xu_3.Pp.id_continue().id_class(rqd_32));
    }

    private static rrPl_1 id_class(String string, rrEm_1 rrEm_12) {
        rrPt_1 rrPt_12 = rrEm_12.O();
        rrPl_1 rrPl_12 = rrPt_12.id_break(new rqO_2(string));
        if (rrPl_12 != null) {
            return rrPl_12;
        }
        String string2 = string + ".snbt";
        Path path = Paths.get(id_class, string2);
        rcd_3 rcd_32 = rlH_2.id_class(path);
        if (rcd_32 == null) {
            throw new RuntimeException("Could not find structure file " + path + ", and the structure is not available in the world structures either.");
        }
        return rrPt_12.id_class(rcd_32);
    }

    public static rfl_3 id_class(ryG_2 ryG_22) {
        rfH_2 rfH_22 = ryG_22.id_char();
        rfH_2 rfH_23 = rfH_22.id_break(ryG_22.id_extends().id_break(-1, -1, -1));
        rfH_2 rfH_24 = rrPl_1.id_class(rfH_23, rpa_3.NONE, ryG_22.id_volatile(), rfH_22);
        return new rfl_3(rfH_22, rfH_24);
    }

    public static Optional<rfH_2> id_class(rfH_2 rfH_22, int n, rrEm_1 rrEm_12) {
        return rlH_2.id_byte(rfH_22, n, rrEm_12).stream().filter(rfH_23 -> rlH_2.id_class(rfH_23, rfH_22, rrEm_12)).findFirst();
    }

    public static rfi_3 id_class(rfH_2 rfH_22, rfH_2 rfH_23, rqd_3 rqd_32) {
        rfH_2 rfH_24 = rfH_22.id_break(rfH_23).id_break(-1, -1, -1);
        rfH_2 rfH_25 = rrPl_1.id_class(rfH_24, rpa_3.NONE, rqd_32, rfH_22);
        rfi_3 rfi_32 = rfi_3.id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), rfH_25.b_(), rfH_25.c_(), rfH_25.d_());
        int n = Math.min(rfi_32.id_class, rfi_32.id_protected);
        int n2 = Math.min(rfi_32.id_byte, rfi_32.id_case);
        rfH_2 rfH_26 = new rfH_2(rfH_22.b_() - n, 0, rfH_22.d_() - n2);
        rfi_32.id_class(rfH_26);
        return rfi_32;
    }

    public static void id_class(rfi_3 rfi_32, int n, rrEm_1 rrEm_12) {
        rfi_3 rfi_33 = new rfi_3(rfi_32.id_class - 2, rfi_32.id_break - 3, rfi_32.id_byte - 3, rfi_32.id_protected + 3, rfi_32.id_throws + 20, rfi_32.id_case + 3);
        rfH_2.id_class(rfi_33).forEach(rfH_22 -> rlH_2.id_class(n, rfH_22, rrEm_12));
        rrEm_12.id_synchronized().id_class(rfi_33, true, false);
        rrEm_12.id_class(rfi_33);
        rfl_3 rfl_32 = new rfl_3(rfi_33.id_class, rfi_33.id_break, rfi_33.id_byte, rfi_33.id_protected, rfi_33.id_throws, rfi_33.id_case);
        List<an_3> list = rrEm_12.id_class(an_3.class, rfl_32, an_32 -> !(an_32 instanceof rhd_3));
        list.forEach(an_3::PD);
    }

    public static rfH_2 id_break(rfH_2 rfH_22, int n, rrEm_1 rrEm_12) {
        Comparator<rfH_2> comparator = Comparator.comparingInt(rfH_23 -> rfH_23.id_implements(rfH_22));
        Collection<rfH_2> collection = rlH_2.id_byte(rfH_22, n, rrEm_12);
        Optional<rfH_2> optional = collection.stream().min(comparator);
        return optional.orElse(null);
    }

    public static rfi_3 id_break(ryG_2 ryG_22) {
        rfH_2 rfH_22 = ryG_22.id_char();
        rfH_2 rfH_23 = rfH_22.id_break(ryG_22.id_extends().id_break(-1, -1, -1));
        rfH_2 rfH_24 = rrPl_1.id_class(rfH_23, rpa_3.NONE, ryG_22.id_volatile(), rfH_22);
        return new rfi_3(rfH_22, rfH_24);
    }
}


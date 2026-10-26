/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rAA;
import celestial.rTH;
import celestial.rVF;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rVq_1;
import celestial.rVv_1;
import celestial.rYB;
import celestial.rYG;
import celestial.rYY;
import celestial.rYi_1;
import celestial.rYl_1;
import celestial.rcW_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rfj_3;
import celestial.roV_2;
import celestial.roe_3;
import celestial.rog_3;
import celestial.ror_3;
import celestial.rpC_2;
import celestial.rrGP;
import celestial.rrGk_1;
import celestial.rrGr_1;
import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrED {
    private static final Logger id_class = LogManager.getLogger();

    private static void id_class(rVv_1 rVv_12, File file, File file2, rYY rYY2, int n, int n2, rpC_2 rpC_22) {
        String string = file2.getName();
        try (roe_3 roe_32 = new roe_3(file2, file, true);
             roe_3 roe_33 = new roe_3(new File(file, string.substring(0, string.length() - ".mcr".length()) + ".mca"), file, true);){
            for (int i = 0; i < 32; ++i) {
                int n3;
                for (n3 = 0; n3 < 32; ++n3) {
                    rcd_3 rcd_32;
                    Object object;
                    rfj_3 rfj_32 = new rfj_3(i, n3);
                    if (!roe_32.id_protected(rfj_32) || roe_33.id_protected(rfj_32)) continue;
                    try {
                        object = roe_32.id_class(rfj_32);
                        try {
                            if (object == null) {
                                id_class.warn("Failed to fetch input stream for chunk {}", (Object)rfj_32);
                                continue;
                            }
                            rcd_32 = rcW_2.id_class((DataInput)object);
                        }
                        finally {
                            if (object != null) {
                                ((FilterInputStream)object).close();
                            }
                        }
                    }
                    catch (IOException iOException) {
                        id_class.warn("Failed to read data for chunk {}", (Object)rfj_32, (Object)iOException);
                        continue;
                    }
                    object = rcd_32.id_int("Level");
                    rog_3 rog_32 = roV_2.id_class((rcd_3)object);
                    rcd_3 rcd_33 = new rcd_3();
                    rcd_3 rcd_34 = new rcd_3();
                    rcd_33.id_class("Level", rcd_34);
                    roV_2.id_class(rVv_12, rog_32, rcd_34, rYY2);
                    try (DataOutputStream dataOutputStream = roe_33.id_byte(rfj_32);){
                        rcW_2.id_class(rcd_33, (DataOutput)dataOutputStream);
                        continue;
                    }
                }
                n3 = (int)Math.round(100.0 * (double)(n * 1024) / (double)(n2 * 1024));
                int n4 = (int)Math.round(100.0 * (double)((i + 1) * 32 + n * 1024) / (double)(n2 * 1024));
                if (n4 <= n3) continue;
                rpC_22.id_break(n4);
            }
        }
        catch (IOException iOException) {
            id_class.error("Failed to upgrade region file {}", (Object)file2, (Object)iOException);
        }
    }

    private static void id_class(File file2, Collection<File> collection) {
        File file3 = new File(file2, "region");
        File[] fileArray = file3.listFiles((file, string) -> string.endsWith(".mcr"));
        if (fileArray != null) {
            Collections.addAll(collection, fileArray);
        }
    }

    public static boolean id_class(rrGk_1 rrGk_12, rpC_2 rpC_22) {
        rpC_22.id_break(0);
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        File file = rrGk_12.id_class(rYB.id_byte);
        File file2 = rrGk_12.id_class(rYB.id_protected);
        File file3 = rrGk_12.id_class(rYB.id_throws);
        id_class.info("Scanning folders...");
        rrED.id_class(file, arrayList);
        if (file2.exists()) {
            rrED.id_class(file2, arrayList2);
        }
        if (file3.exists()) {
            rrED.id_class(file3, arrayList3);
        }
        int n = arrayList.size() + arrayList2.size() + arrayList3.size();
        id_class.info("Total conversion count is {}", (Object)n);
        rVv_1 rVv_12 = rVm_1.id_break();
        rVq_1<rcZ_2> rVq_12 = rVq_1.id_class(rcf_3.id_class, rAA.INSTANCE, rVv_12);
        rrGP rrGP2 = rrGk_12.id_class(rVq_12, rTH.id_class);
        long l = rrGP2 != null ? rrGP2.id_long().id_class() : 0L;
        rVF<rYG> rVF2 = rVv_12.id_break(rVL.n);
        rYY rYY2 = rrGP2 != null && rrGP2.id_long().id_private() ? new ror_3(rVF2.id_byte(rYl_1.id_break)) : new rYi_1(l, false, false, rVF2);
        rrED.id_class(rVv_12, new File(file, "region"), arrayList, rYY2, 0, n, rpC_22);
        rrED.id_class(rVv_12, new File(file2, "region"), arrayList2, (rYY)new ror_3(rVF2.id_byte(rYl_1.id_implements)), arrayList.size(), n, rpC_22);
        rrED.id_class(rVv_12, new File(file3, "region"), arrayList3, (rYY)new ror_3(rVF2.id_byte(rYl_1.id_finally)), arrayList.size() + arrayList2.size(), n, rpC_22);
        rrED.id_class(rrGk_12);
        rrGk_12.id_class(rVv_12, rrGP2);
        return true;
    }

    private static void id_class(rVv_1 rVv_12, File file, Iterable<File> iterable, rYY rYY2, int n, int n2, rpC_2 rpC_22) {
        for (File file2 : iterable) {
            rrED.id_class(rVv_12, file, file2, rYY2, n, n2, rpC_22);
            int n3 = (int)Math.round(100.0 * (double)(++n) / (double)n2);
            rpC_22.id_break(n3);
        }
    }

    private static void id_class(rrGk_1 rrGk_12) {
        File file = rrGk_12.id_class(rrGr_1.id_throws).toFile();
        if (!file.exists()) {
            id_class.warn("Unable to create level.dat_mcr backup");
        } else {
            File file2 = new File(file.getParent(), "level.dat_mcr");
            if (!file.renameTo(file2)) {
                id_class.warn("Unable to create level.dat_mcr backup");
            }
        }
    }
}


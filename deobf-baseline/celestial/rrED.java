package celestial;

import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rrED {
   private static final Logger id_class = LogManager.getLogger();

   private static void id_class(rVv_1 var0, File var1, File var2, rYY var3, int var4, int var5, rpC_2 var6) {
      String var7 = var2.getName();

      try (
         roe_3 var8 = new roe_3(var2, var1, true);
         roe_3 var9 = new roe_3(new File(var1, var7.substring(0, var7.length() - ".mcr".length()) + ".mca"), var1, true);
      ) {
         for (int var10 = 0; var10 < 32; var10++) {
            for (int var11 = 0; var11 < 32; var11++) {
               rfj_3 var12 = new rfj_3(var10, var11);
               if (var8.id_protected(var12) && !var9.id_protected(var12)) {
                  rcd_3 var13;
                  try (DataInputStream var14 = var8.id_class(var12)) {
                     if (var14 == null) {
                        id_class.warn("Failed to fetch input stream for chunk {}", var12);
                        continue;
                     }

                     var13 = rcW_2.id_class((DataInput)var14);
                  } catch (IOException var27) {
                     id_class.warn("Failed to read data for chunk {}", var12, var27);
                     continue;
                  }

                  rcd_3 var33 = var13.id_int("Level");
                  rog_3 var15 = roV_2.id_class(var33);
                  rcd_3 var16 = new rcd_3();
                  rcd_3 var17 = new rcd_3();
                  var16.id_class("Level", var17);
                  roV_2.id_class(var0, var15, var17, var3);

                  try (DataOutputStream var18 = var9.id_byte(var12)) {
                     rcW_2.id_class(var16, (DataOutput)var18);
                  }
               }
            }

            int var31 = (int)Math.round(100.0 * (double)(var4 * 1024) / (double)(var5 * 1024));
            int var32 = (int)Math.round(100.0 * (double)((var10 + 1) * 32 + var4 * 1024) / (double)(var5 * 1024));
            if (var32 > var31) {
               var6.id_break(var32);
            }
         }
      } catch (IOException var30) {
         id_class.error("Failed to upgrade region file {}", var2, var30);
      }
   }

   private static void id_class(File var0, Collection<File> var1) {
      File var2 = new File(var0, "region");
      File[] var3 = var2.listFiles((var0x, var1x) -> var1x.endsWith(".mcr"));
      if (var3 != null) {
         Collections.addAll(var1, var3);
      }
   }

   static boolean id_class(rrGk_1 var0, rpC_2 var1) {
      var1.id_break(0);
      ArrayList var2 = Lists.newArrayList();
      ArrayList var3 = Lists.newArrayList();
      ArrayList var4 = Lists.newArrayList();
      File var5 = var0.id_class(rYB.id_byte);
      File var6 = var0.id_class(rYB.id_protected);
      File var7 = var0.id_class(rYB.id_throws);
      id_class.info("Scanning folders...");
      id_class(var5, var2);
      if (var6.exists()) {
         id_class(var6, var3);
      }

      if (var7.exists()) {
         id_class(var7, var4);
      }

      int var8 = var2.size() + var3.size() + var4.size();
      id_class.info("Total conversion count is {}", var8);
      rVv_1 var9 = rVm_1.id_break();
      rVq_1 var10 = rVq_1.id_class(rcf_3.id_class, rAA.INSTANCE, var9);
      rrGP var11 = var0.id_class(var10, rTH.id_class);
      long var12 = var11 != null ? var11.id_long().id_class() : 0L;
      rVF var14 = var9.id_break(rVL.n);
      Object var15;
      if (var11 != null && var11.id_long().id_private()) {
         var15 = new ror_3(var14.id_byte(rYl_1.id_break));
      } else {
         var15 = new rYi_1(var12, false, false, var14);
      }

      id_class(var9, new File(var5, "region"), var2, (rYY)var15, 0, var8, var1);
      id_class(var9, new File(var6, "region"), var3, new ror_3(var14.id_byte(rYl_1.id_implements)), var2.size(), var8, var1);
      id_class(var9, new File(var7, "region"), var4, new ror_3(var14.id_byte(rYl_1.id_finally)), var2.size() + var3.size(), var8, var1);
      id_class(var0);
      var0.id_class(var9, var11);
      return true;
   }

   private static void id_class(rVv_1 var0, File var1, Iterable<File> var2, rYY var3, int var4, int var5, rpC_2 var6) {
      for (File var8 : var2) {
         id_class(var0, var1, var8, var3, var4, var5, var6);
         var4++;
         int var9 = (int)Math.round(100.0 * (double)var4 / (double)var5);
         var6.id_break(var9);
      }
   }

   private static void id_class(rrGk_1 var0) {
      File var1 = var0.id_class(rrGr_1.id_throws).toFile();
      if (!var1.exists()) {
         id_class.warn("Unable to create level.dat_mcr backup");
      } else {
         File var2 = new File(var1.getParent(), "level.dat_mcr");
         if (!var1.renameTo(var2)) {
            id_class.warn("Unable to create level.dat_mcr backup");
         }
      }
   }
}

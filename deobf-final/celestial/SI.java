package celestial;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SI implements PP, C_super {
   private static short[] throws_;
   private static long[] case_;
   public static Object[] class_;
   private static int[] catch_;
   private static double[] private_;
   private static byte[] implements_;
   private static boolean[] finally_;
   public Object[] break_;

   public boolean byte_(int var1, int var2) {
      return this.throws_(var1 >> 9, var2 >> 9) != null ? true : finally_[4];
   }

   private void byte_() {
      if (this.break_ == null) {
         this.break_ = new Object[5];
         Object[] var1 = this.break_;
      }
   }

   public SI(Path var1, rqM_2<rYB> var2) {
      this.byte_();
      Long2ObjectOpenHashMap var8 = new Long2ObjectOpenHashMap();
      this.break_[0] = var8;
      LinkedBlockingQueue var9 = new LinkedBlockingQueue();
      this.break_[2] = var9;
      ConcurrentHashMap var10 = new ConcurrentHashMap();
      this.break_[3] = var10;
      if (!Files.exists(var1)) {
         try {
            Files.createDirectories(var1);
         } catch (IOException var13) {
         }
      }

      String var11 = var1.toString();
      this.break_[1] = var11;
      this.break_[4] = var2;
      C_class.interface_().execute(new Sf_1(this));
      C_class.interface_().execute(() -> {
         try {
            Thread.sleep(case_[5]);

            while (true) {
               this.class_();
               Thread.sleep(case_[6]);
            }
         } catch (InterruptedException var2x) {
            var2x.printStackTrace();
         }
      });
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1461470521;
   }

   @Override
   public void class_() {
      if (!(Boolean)C_class.instanceof_().throw_.class_[0]) {
         this.catch_().forEach(var0 -> {
            if (var0 != null) {
               var0.byte_();
            }
         });
         this.finally_();
      } else {
         this.catch_().parallelStream().forEach(var1 -> {
            if (var1 != null) {
               var1.byte_((String)this.break_[1]);
            }
         });
         this.finally_();
      }
   }

   void class_(St_1 var1) {
      Sw_1 var2 = this.case_((Integer)var1.break_[0] >> 5, (Integer)var1.break_[1] >> 5);
      var2.class_((Integer)var1.break_[0] & 31, (Integer)var1.break_[1] & 31, var1);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, 35, -77, -106, 114, 41, 61, -45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(roJ_2 var1) {
      if (((Map)this.break_[3]).put(var1.private_(), var1) == null) {
         ((LinkedBlockingQueue)this.break_[2]).add(var1.private_());
      }
   }

   @Override
   public ArrayList<rfH_2> class_(String var1, int var2, int var3, int var4, int var5) {
      ArrayList var6 = new ArrayList();
      int var7 = var3 >> 9;
      int var8 = var4 >> 9;

      for (int var9 = 0; var9 <= var5; var9++) {
         for (int var10 = -var9; var10 <= var9; var10++) {
            for (int var11 = -var9; var11 <= var9; var11++) {
               int var12 = var10 * var10 + var11 * var11;
               if (var12 == var9) {
                  int var13 = var10 + var7;
                  int var14 = var11 + var8;
                  Sw_1 var15 = this.case_(var13, var14);
                  if (var15 != null) {
                     var6.addAll(var15.protected_(var1));
                  }
               }
            }
         }

         if (var6.size() >= var2) {
            return var6;
         }
      }

      return var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7038093188671640844L;
   }

   @Override
   public boolean break_(int var1, int var2) {
      Sw_1 var3 = this.throws_(var1 >> 9, var2 >> 9);
      return var3 == null ? false : var3.class_(var1 & 511, var2 & 511);
   }

   @Override
   public void break_() {
      long var1 = System.nanoTime() / 1000000L;
      this.catch_().forEach(var1x -> {
         if (var1x != null) {
            var1x.class_((String)this.break_[1]);
         }
      });
      long var3 = System.nanoTime() / 1000000L;
      System.out.println("World load took " + (var3 - var1) + "ms");
   }

   private static void throws_() {
      catch_ = new int[]{58594, -58594, 58594, -58594, 58594};
   }

   public synchronized Sw_1 throws_(int var1, int var2) {
      return (Sw_1)((Long2ObjectMap)this.break_[0]).get(this.private_(var1, var2));
   }

   private synchronized void finally_() {
      if ((Boolean)C_class.instanceof_().throws_.class_[0]) {
         rfH_2 var1 = this.native_();

         for (Sw_1 var3 : this.catch_()) {
            if (var3 != null) {
               int var4 = (var3.break_() << 9) + 256 - var1.b_();
               int var5 = (var3.class_() << 9) + 256 - var1.d_();
               double var6 = Math.sqrt((double)(var4 * var4 + var5 * var5));
               if (var6 > 1024.0) {
                  if (!(Boolean)C_class.instanceof_().A.class_[0]) {
                     this.byte_("Deleting cached region " + var3.break_() + "," + var3.class_() + " from ram");
                  }

                  ((Long2ObjectMap)this.break_[0]).remove(this.private_(var3.break_(), var3.class_()));
               }
            }
         }
      }
   }

   private boolean catch_(int var1, int var2) {
      return var1 <= 58594 && var1 >= -58594 && var2 <= 58594 && var2 >= -58594 ? true : finally_[11];
   }

   private synchronized List<Sw_1> catch_() {
      return new ArrayList<>(((Long2ObjectMap)this.break_[0]).values());
   }

   private static void extends_() {
      private_ = new double[]{1024.0};
   }

   private static void case_() {
      finally_ = new boolean[]{false, false, false, true, false, false, false, false, false, false, true, false, true, false};
   }

   private synchronized Sw_1 case_(int var1, int var2) {
      return (Sw_1)((Long2ObjectMap)this.break_[0]).computeIfAbsent(this.private_(var1, var2), var3 -> {
         Sw_1 var5 = new Sw_1(var1, var2, (rqM_2<rYB>)this.break_[4]);
         var5.class_((String)this.break_[1]);
         return var5;
      });
   }

   private static void implements_() {
      Object[] var0 = new Object[]{58594};
      class_ = var0;
   }

   public void protected_(int var1, int var2) {
      this.case_(var1, var2);
   }

   private static void protected_() {
      implements_ = new byte[]{9, 9, 9, 9, 9, 9, 5, 5, 31, 31, 9, 9, 4, 8, 4, 8, 32, 5};
   }

   private long private_(int var1, int var2) {
      return !this.catch_(var1, var2) ? 0L : (long)var1 & 4294967295L | ((long)var2 & 4294967295L) << 32;
   }

   private static void final_() {
      throws_ = new short[]{0, 2, 3, 1, 4, 3, 2, 511, 511, 0, 1, 0, 1, 0, 0, 256, 256, 0, 0, 7, 7, 0, 1, 0, 0, 0, 4, 1, 1, 1};
   }

   private static void volatile_() {
      case_ = new long[]{1000000L, 1000000L, 0L, 4294967295L, 4294967295L, 30000L, 600000L};
   }

   private rfH_2 native_() {
      for (C_case var2 : C_throws.class_().case_()) {
         C_return var3 = var2.implements_().class_();
         if (var3 != null && var3.break_() == this && var2.throw_().catch_() != null) {
            return var2.throw_().volatile_();
         }
      }

      St_1 var5 = null;

      for (Sw_1 var7 : this.catch_()) {
         if (var7 != null) {
            St_1 var4 = var7.protected_();
            if (var4 != null && (var5 == null || (Long)var5.break_[7] < (Long)var4.break_[7])) {
               var5 = var4;
            }
         }
      }

      return var5 == null ? new rfH_2(0, 0, 0) : new rfH_2(((Integer)var5.break_[0] << 4) + 8, 0, ((Integer)var5.break_[1] << 4) + 8);
   }
}

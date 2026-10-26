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
   private static short[] id_throws;
   private static long[] id_case;
   public static Object[] id_class;
   private static int[] id_catch;
   private static double[] id_private;
   private static byte[] id_implements;
   private static boolean[] id_finally;
   public Object[] id_break;

   public boolean id_byte(int var1, int var2) {
      return this.id_throws(var1 >> 9, var2 >> 9) != null ? true : id_finally[4];
   }

   private void id_byte() {
      if (this.id_break == null) {
         this.id_break = new Object[5];
         Object[] var1 = this.id_break;
      }
   }

   public SI(Path var1, rqM_2<rYB> var2) {
      this.id_byte();
      Long2ObjectOpenHashMap var8 = new Long2ObjectOpenHashMap();
      this.id_break[0] = var8;
      LinkedBlockingQueue var9 = new LinkedBlockingQueue();
      this.id_break[2] = var9;
      ConcurrentHashMap var10 = new ConcurrentHashMap();
      this.id_break[3] = var10;
      if (!Files.exists(var1)) {
         try {
            Files.createDirectories(var1);
         } catch (IOException var13) {
         }
      }

      String var11 = var1.toString();
      this.id_break[1] = var11;
      this.id_break[4] = var2;
      C_class.id_interface().execute(new Sf_1(this));
      C_class.id_interface().execute(() -> {
         try {
            Thread.sleep(id_case[5]);

            while (true) {
               this.id_class();
               Thread.sleep(id_case[6]);
            }
         } catch (InterruptedException var2x) {
            var2x.printStackTrace();
         }
      });
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1461470521;
   }

   @Override
   public void id_class() {
      if (!(Boolean)C_class.id_instanceof().id_throw.id_class[0]) {
         this.id_catch().forEach(var0 -> {
            if (var0 != null) {
               var0.id_byte();
            }
         });
         this.id_finally();
      } else {
         this.id_catch().parallelStream().forEach(var1 -> {
            if (var1 != null) {
               var1.id_byte((String)this.id_break[1]);
            }
         });
         this.id_finally();
      }
   }

   void id_class(St_1 var1) {
      Sw_1 var2 = this.id_case((Integer)var1.id_break[0] >> 5, (Integer)var1.id_break[1] >> 5);
      var2.id_class((Integer)var1.id_break[0] & 31, (Integer)var1.id_break[1] & 31, var1);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, 35, -77, -106, 114, 41, 61, -45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(roJ_2 var1) {
      if (((Map)this.id_break[3]).put(var1.id_private(), var1) == null) {
         ((LinkedBlockingQueue)this.id_break[2]).add(var1.id_private());
      }
   }

   @Override
   public ArrayList<rfH_2> id_class(String var1, int var2, int var3, int var4, int var5) {
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
                  Sw_1 var15 = this.id_case(var13, var14);
                  if (var15 != null) {
                     var6.addAll(var15.id_protected(var1));
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

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7038093188671640844L;
   }

   @Override
   public boolean id_break(int var1, int var2) {
      Sw_1 var3 = this.id_throws(var1 >> 9, var2 >> 9);
      return var3 == null ? false : var3.id_class(var1 & 511, var2 & 511);
   }

   @Override
   public void id_break() {
      long var1 = System.nanoTime() / 1000000L;
      this.id_catch().forEach(var1x -> {
         if (var1x != null) {
            var1x.id_class((String)this.id_break[1]);
         }
      });
      long var3 = System.nanoTime() / 1000000L;
      System.out.println("World load took " + (var3 - var1) + "ms");
   }

   private static void id_throws() {
      id_catch = new int[]{58594, -58594, 58594, -58594, 58594};
   }

   public synchronized Sw_1 id_throws(int var1, int var2) {
      return (Sw_1)((Long2ObjectMap)this.id_break[0]).get(this.id_private(var1, var2));
   }

   private synchronized void id_finally() {
      if ((Boolean)C_class.id_instanceof().id_throws.id_class[0]) {
         rfH_2 var1 = this.id_native();

         for (Sw_1 var3 : this.id_catch()) {
            if (var3 != null) {
               int var4 = (var3.id_break() << 9) + 256 - var1.b_();
               int var5 = (var3.id_class() << 9) + 256 - var1.d_();
               double var6 = Math.sqrt((double)(var4 * var4 + var5 * var5));
               if (var6 > 1024.0) {
                  if (!(Boolean)C_class.id_instanceof().A.id_class[0]) {
                     this.id_byte("Deleting cached region " + var3.id_break() + "," + var3.id_class() + " from ram");
                  }

                  ((Long2ObjectMap)this.id_break[0]).remove(this.id_private(var3.id_break(), var3.id_class()));
               }
            }
         }
      }
   }

   private boolean id_catch(int var1, int var2) {
      return var1 <= 58594 && var1 >= -58594 && var2 <= 58594 && var2 >= -58594 ? true : id_finally[11];
   }

   private synchronized List<Sw_1> id_catch() {
      return new ArrayList<>(((Long2ObjectMap)this.id_break[0]).values());
   }

   private static void id_extends() {
      id_private = new double[]{1024.0};
   }

   private static void id_case() {
      id_finally = new boolean[]{false, false, false, true, false, false, false, false, false, false, true, false, true, false};
   }

   private synchronized Sw_1 id_case(int var1, int var2) {
      return (Sw_1)((Long2ObjectMap)this.id_break[0]).computeIfAbsent(this.id_private(var1, var2), var3 -> {
         Sw_1 var5 = new Sw_1(var1, var2, (rqM_2<rYB>)this.id_break[4]);
         var5.id_class((String)this.id_break[1]);
         return var5;
      });
   }

   private static void id_implements() {
      Object[] var0 = new Object[]{58594};
      id_class = var0;
   }

   public void id_protected(int var1, int var2) {
      this.id_case(var1, var2);
   }

   private static void id_protected() {
      id_implements = new byte[]{9, 9, 9, 9, 9, 9, 5, 5, 31, 31, 9, 9, 4, 8, 4, 8, 32, 5};
   }

   private long id_private(int var1, int var2) {
      return !this.id_catch(var1, var2) ? 0L : (long)var1 & 4294967295L | ((long)var2 & 4294967295L) << 32;
   }

   private static void id_final() {
      id_throws = new short[]{0, 2, 3, 1, 4, 3, 2, 511, 511, 0, 1, 0, 1, 0, 0, 256, 256, 0, 0, 7, 7, 0, 1, 0, 0, 0, 4, 1, 1, 1};
   }

   private static void id_volatile() {
      id_case = new long[]{1000000L, 1000000L, 0L, 4294967295L, 4294967295L, 30000L, 600000L};
   }

   private rfH_2 id_native() {
      for (C_case var2 : C_throws.id_class().id_case()) {
         C_return var3 = var2.id_implements().id_class();
         if (var3 != null && var3.id_break() == this && var2.id_throw().id_catch() != null) {
            return var2.id_throw().id_volatile();
         }
      }

      St_1 var5 = null;

      for (Sw_1 var7 : this.id_catch()) {
         if (var7 != null) {
            St_1 var4 = var7.id_protected();
            if (var4 != null && (var5 == null || (Long)var5.id_break[7] < (Long)var4.id_break[7])) {
               var5 = var4;
            }
         }
      }

      return var5 == null ? new rfH_2(0, 0, 0) : new rfH_2(((Integer)var5.id_break[0] << 4) + 8, 0, ((Integer)var5.id_break[1] << 4) + 8);
   }
}

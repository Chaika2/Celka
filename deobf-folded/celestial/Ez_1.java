package celestial;

import com.google.common.collect.Lists;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ez_1 extends MP {
   private static short[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   private static double[] id_throws;

   @Override
   public rP_2 id_byte() {
      this.id_volatile();
      return (rP_2)this.id_class[5];
   }

   public Ez_1(rU_2 var1, EQ var2, EQ var3, int var4, rP_2 var5, EZ var6) {
      this.id_volatile();
      rU_2 var16 = new rU_2((Integer)var3.id_class[id_break[0]], (Integer)var3.id_class[1], (Integer)var3.id_class[2]);
      this.id_class[1] = var16;
      Integer var17 = var4;
      this.id_class[6] = var17;
      ArrayList var18 = new ArrayList();
      this.id_class[3] = var18;
      this.id_class[5] = var5;
      this.id_class[7] = var6;
      EQ var7 = var3;
      ArrayList var8 = new ArrayList();

      ArrayList var9;
      for (var9 = new ArrayList(); var7 != null; var7 = (EQ)var7.id_class[6]) {
         var9.add(var7);
         var8.add(new rU_2((Integer)var7.id_class[id_break[8]], (Integer)var7.id_class[1], (Integer)var7.id_class[2]));
      }

      rU_2 var10 = new rU_2((Integer)var2.id_class[id_break[12]], (Integer)var2.id_class[1], (Integer)var2.id_class[2]);
      if (!var1.equals(var10) && var2.equals(var3)) {
         this.id_class[id_break[15]] = var1;
         EQ var11 = new EQ((Integer)var1.id_break[id_break[16]], (Integer)var1.id_break[1], (Integer)var1.id_break[2], var5);
         Double var22 = id_throws[0];
         var11.id_class[4] = var22;
         var9.add(var11);
         var8.add(var1);
      } else {
         this.id_class[id_break[20]] = var10;
      }

      List var24 = Lists.reverse(var8);
      this.id_class[2] = var24;
      List var25 = Lists.reverse(var9);
      this.id_class[4] = var25;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, 9, 64, 5, -26, 39, -91, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private Ev_1 id_class(rU_2 var1, rU_2 var2, double var3) {
      this.id_volatile();
      EC[] var5 = EC.values();
      int var6 = var5.length;

      for (int var7 = id_protected[6]; var7 < var6; var7++) {
         EC var8 = var5[var7];
         Ev_1 var9 = var8.id_class((EZ)this.id_class[7], var1);
         if (var9.id_implements().equals(var2)) {
            var9.id_byte(Math.min(var9.id_class((EZ)this.id_class[7]), var3));
            return var9;
         }
      }

      PP.a_.id_byte("Movement became impossible during calculation " + var1 + " " + var2 + " " + var2.id_byte(var1));
      return null;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5246446876764840531L;
   }

   @Override
   public List<rU_2> id_break() {
      this.id_volatile();
      return Collections.unmodifiableList((List<? extends rU_2>)this.id_class[2]);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1380572557;
   }

   private static void id_finally() {
      id_break = new short[]{
         0, 1, 2, 1, 6, 3, 5, 7, 0, 1, 2, 6, 0, 1, 2, 0, 0, 1, 2, 4, 0, 2, 4, 5, 2, 3, 2, 4, 4, 4, 4, 2, 2, 3, 7, 7, 8, 8, 3, 3, 8, 3, 2, 6, 0, 1, 7
      };
   }

   @Override
   public List<rd_3> id_catch() {
      this.id_volatile();
      if (!(Boolean)this.id_class[8]) {
         throw new IllegalStateException();
      } else {
         return Collections.unmodifiableList((List<? extends rd_3>)this.id_class[3]);
      }
   }

   private boolean id_extends() {
      this.id_volatile();
      if (!((List)this.id_class[2]).isEmpty() && ((List)this.id_class[3]).isEmpty()) {
         for (int var1 = id_protected[0]; var1 < ((List)this.id_class[2]).size() - 1; var1++) {
            double var2 = (Double)((EQ)((List)this.id_class[4]).get(var1 + 1)).id_class[4] - (Double)((EQ)((List)this.id_class[4]).get(var1)).id_class[4];
            Ev_1 var4 = this.id_class((rU_2)((List)this.id_class[2]).get(var1), (rU_2)((List)this.id_class[2]).get(var1 + 1), var2);
            if (var4 == null) {
               return true;
            }

            ((List)this.id_class[3]).add(var4);
         }

         return id_protected[5];
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public int id_case() {
      this.id_volatile();
      return (Integer)this.id_class[6];
   }

   @Override
   public rU_2 id_implements() {
      this.id_volatile();
      return (rU_2)this.id_class[id_break[44]];
   }

   private static void id_package() {
      id_protected = new boolean[]{false, true, true, true, true, false, false, true, false, false};
   }

   @Override
   public rU_2 id_protected() {
      this.id_volatile();
      return (rU_2)this.id_class[1];
   }

   @Override
   public a_1 id_private() {
      this.id_volatile();
      if ((Boolean)this.id_class[8]) {
         throw new IllegalStateException();
      } else {
         Boolean var7 = true;
         this.id_class[8] = var7;
         boolean var1 = this.id_extends();
         ((List)this.id_class[3]).forEach(var1x -> {
            this.id_volatile();
            var1x.id_byte((EZ)this.id_class[7]);
         });
         if (var1) {
            GO var2 = new GO(this, this.id_catch().size());
            if (var2.id_catch().size() != ((List)this.id_class[3]).size()) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            this.id_throws();
            return this;
         }
      }
   }

   private static void id_final() {
      id_throws = new double[1];
   }

   private void id_volatile() {
      if (this.id_class == null) {
         this.id_class = new Object[9];
         Object[] var1 = this.id_class;
         var1[6] = Integer.valueOf(id_protected[8]);
         var1[8] = id_protected[9];
      }
   }

   private static void id_native() {
      id_byte = new byte[]{9, 6, 8};
   }
}

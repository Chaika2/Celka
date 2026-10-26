package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rH_2 extends rl_3 {
   private static boolean[] id_byte;
   public Object[] id_break;
   private static short[] id_protected;
   private static byte[] id_throws;
   private static String[] id_case;

   public rH_2(int var1, int var2, int var3) {
      super(var1, var2, var3);
      this.id_throws();
      ArrayList var8 = new ArrayList();
      this.id_break[id_protected[15]] = var8;
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6978375932044414814L;
   }

   public void id_class(rq_3 var1, int var2, int var3, int var4) {
      this.id_throws();
      ((List)this.id_break[id_protected[16]]).add(new ry_3(var1, var2, var3, var4));
      this.id_catch();
   }

   @Override
   public xc_3 id_class(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      ry_3 var6 = this.id_break(var1, var2, var3, var4);
      if (var6 == null) {
         throw new IllegalStateException(id_case[0]);
      } else {
         return ((rq_3)var6.id_class[id_protected[29]])
            .id_class(var1 - (Integer)var6.id_class[1], var2 - (Integer)var6.id_class[2], var3 - (Integer)var6.id_class[3], var4, var5);
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3, xc_3 var4) {
      ry_3 var5 = this.id_break(var1, var2, var3, var4);
      return var5 != null
            && ((rq_3)var5.id_class[id_protected[25]])
               .id_class(var1 - (Integer)var5.id_class[1], var2 - (Integer)var5.id_class[2], var3 - (Integer)var5.id_class[3], var4)
         ? true
         : id_byte[4];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1051215312;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{58, 74, -46, 71, 108, 127, 57, -25}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private ry_3 id_break(int var1, int var2, int var3, xc_3 var4) {
      this.id_throws();
      ry_3[] var5 = (ry_3[])this.id_break[1];
      int var6 = var5.length;

      for (int var7 = id_byte[2]; var7 < var6; var7++) {
         ry_3 var8 = var5[var7];
         if (var1 >= (Integer)var8.id_class[1]
            && var2 >= (Integer)var8.id_class[2]
            && var3 >= (Integer)var8.id_class[3]
            && ((rq_3)var8.id_class[id_protected[21]])
               .id_class(var1 - (Integer)var8.id_class[1], var2 - (Integer)var8.id_class[2], var3 - (Integer)var8.id_class[3], var4)) {
            return var8;
         }
      }

      return null;
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_finally() {
      id_protected = new short[]{0, 1, 1, 0, 1, 0, 0, 1, 2, 0, 1, 2, 3, 0, 2, 0, 0, 1, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 1, 0};
   }

   private void id_catch() {
      this.id_throws();
      ry_3[] var9 = ((List)this.id_break[id_protected[0]]).toArray(new ry_3[id_byte[0]]);
      this.id_break[1] = var9;
      ry_3[] var1 = (ry_3[])this.id_break[1];
      int var2 = var1.length;

      for (int var3 = id_byte[1]; var3 < var2; var3++) {
         ry_3 var4 = var1[var3];
         Integer var10 = Math.max((Integer)this.id_class[id_protected[3]], (Integer)var4.id_class[1] + ((rq_3)var4.id_class[id_protected[5]]).id_break());
         this.id_class[id_protected[6]] = var10;
         Integer var11 = Math.max((Integer)this.id_class[1], (Integer)var4.id_class[2] + ((rq_3)var4.id_class[id_protected[9]]).id_class());
         this.id_class[1] = var11;
         Integer var12 = Math.max((Integer)this.id_class[2], (Integer)var4.id_class[3] + ((rq_3)var4.id_class[id_protected[13]]).id_byte());
         this.id_class[2] = var12;
      }
   }

   private static void id_case() {
      id_case = new String[]{new String("couldn't find schematic for this position")};
   }

   private static void id_implements() {
      id_byte = new boolean[]{false, false, false, true, false, false};
   }

   @Override
   public void id_protected() {
      this.id_throws();
      ry_3[] var1 = (ry_3[])this.id_break[1];
      int var2 = var1.length;

      for (int var3 = id_byte[5]; var3 < var2; var3++) {
         ry_3 var4 = var1[var3];
         ((rq_3)var4.id_class[id_protected[34]]).id_protected();
      }
   }

   private static void id_private() {
      id_throws = new byte[]{2};
   }
}

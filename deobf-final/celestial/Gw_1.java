package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gw_1 implements Gt_1 {
   private static short[] break_;
   public Object[] class_;
   private static byte[] byte_;
   private static boolean[] protected_;
   private static int[] throws_;

   private static void byte_() {
      break_ = new short[]{3, 0, 2, 2, 1, 2, 1, 1, 0, 0, 2, 0, 3, 2, 0, 0};
   }

   Gw_1(GH var1, Path var2, boolean var3) throws Exception {
      this.case_();
      this.class_[3] = var1;
      Boolean var14 = var3;
      this.class_[0] = var14;
      Gson var4 = new GsonBuilder().create();
      PG[] var15 = (PG[])var4.fromJson(new InputStreamReader(Files.newInputStream(var2)), PG[].class);
      this.class_[2] = var15;
      var1.case_("Loaded " + ((PG[])this.class_[2]).length + " positions");
      LongOpenHashSet var16 = new LongOpenHashSet();
      this.class_[1] = var16;

      for (PG var8 : (PG[])this.class_[2]) {
         ((LongOpenHashSet)this.class_[1]).add(rfj_3.class_(var8.class_, var8.break_));
      }
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-43, -89, 79, 62, -89, 0, 87, 18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public GI class_(int var1, int var2) {
      return ((LongOpenHashSet)this.class_[1]).contains(rfj_3.class_(var1, var2)) ^ this.class_[0]
         ? (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[0]
         : (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2783528721937672258L;
   }

   @Override
   public int class_() {
      if (!(Boolean)this.class_[0]) {
         return Integer.MAX_VALUE;
      } else {
         int var1 = protected_[2];
         Gq_1 var2 = new Gq_1((GH)this.class_[3]);

         for (PG var6 : (PG[])this.class_[2]) {
            if (var2.class_(var6.class_, var6.break_) != (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[0]) {
               if (++var1 >= (Integer)C_class.instanceof_().rR.class_[0]) {
                  return var1;
               }
            }
         }

         return var1;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1311855721;
   }

   private static void break_() {
      protected_ = new boolean[6];
   }

   private static void throws_() {
      byte_ = new byte[]{4};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[0] = false;
      }
   }

   private static void protected_() {
      throws_ = new int[]{Integer.MAX_VALUE};
   }
}

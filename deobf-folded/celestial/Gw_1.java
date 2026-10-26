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
   private static short[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static int[] id_throws;

   private static void id_byte() {
      id_break = new short[]{3, 0, 2, 2, 1, 2, 1, 1, 0, 0, 2, 0, 3, 2, 0, 0};
   }

   Gw_1(GH var1, Path var2, boolean var3) throws Exception {
      this.id_case();
      this.id_class[3] = var1;
      Boolean var14 = var3;
      this.id_class[id_break[1]] = var14;
      Gson var4 = new GsonBuilder().create();
      PG[] var15 = (PG[])var4.fromJson(new InputStreamReader(Files.newInputStream(var2)), PG[].class);
      this.id_class[2] = var15;
      var1.id_case("Loaded " + ((PG[])this.id_class[2]).length + " positions");
      LongOpenHashSet var16 = new LongOpenHashSet();
      this.id_class[1] = var16;
      PG[] var5 = (PG[])this.id_class[2];
      int var6 = var5.length;

      for (int var7 = id_protected[1]; var7 < var6; var7++) {
         PG var8 = var5[var7];
         ((LongOpenHashSet)this.id_class[1]).add(rfj_3.id_class(var8.id_class, var8.id_break));
      }
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-43, -89, 79, 62, -89, 0, 87, 18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public GI id_class(int var1, int var2) {
      return ((LongOpenHashSet)this.id_class[1]).contains(rfj_3.id_class(var1, var2)) ^ this.id_class[id_break[8]]
         ? (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[id_break[9]]
         : (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[2];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2783528721937672258L;
   }

   @Override
   public int id_class() {
      if (!(Boolean)this.id_class[id_break[11]]) {
         return Integer.MAX_VALUE;
      } else {
         int var1 = id_protected[2];
         Gq_1 var2 = new Gq_1((GH)this.id_class[3]);
         PG[] var3 = (PG[])this.id_class[2];
         int var4 = var3.length;

         for (int var5 = id_protected[3]; var5 < var4; var5++) {
            PG var6 = var3[var5];
            if (var2.id_class(var6.id_class, var6.id_break) != (GI)GI.staticFields7b6dab6bace836ec83a51cd91190c39e[id_break[14]]) {
               if (++var1 >= (Integer)C_class.id_instanceof().rR.id_class[id_break[15]]) {
                  return var1;
               }
            }
         }

         return var1;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1311855721;
   }

   private static void id_break() {
      id_protected = new boolean[6];
   }

   private static void id_throws() {
      id_byte = new byte[]{4};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[id_protected[4]] = id_protected[5];
      }
   }

   private static void id_protected() {
      id_throws = new int[]{Integer.MAX_VALUE};
   }
}

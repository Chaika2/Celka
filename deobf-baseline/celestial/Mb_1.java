package celestial;

import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mb_1 extends rI_2 {
   private static short[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_byte;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{75, -43, -94, -37, 122, 112, 27, 46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Mb_1(rq_3 var1, rja_3 var2, rY_2[] var3) {
      super(var1);
      this.id_throws();
      rY_2[] var8 = Stream.of(var3)
         .map(var1x -> var1x.id_class(rpr_3.WEST, var2.b_()).id_class(rpr_3.DOWN, var2.c_()).id_class(rpr_3.NORTH, var2.d_()))
         .toArray(rY_2[]::new);
      this.id_byte[id_protected[0]] = var8;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -268265936714585139L;
   }

   @Override
   public boolean id_break(int var1, int var2, int var3, xc_3 var4) {
      this.id_throws();
      rY_2[] var5 = (rY_2[])this.id_byte[id_protected[1]];
      int var6 = var5.length;

      for (int var7 = id_throws[0]; var7 < var6; var7++) {
         rY_2 var8 = var5[var7];
         if (var1 >= (Integer)var8.id_class().id_break[id_protected[2]]
            && var2 >= (Integer)var8.id_class().id_break[id_protected[3]]
            && var3 >= (Integer)var8.id_class().id_break[id_protected[4]]
            && var1 <= (Integer)var8.id_protected().id_break[id_protected[5]]
            && var2 <= (Integer)var8.id_protected().id_break[id_protected[6]]
            && var3 <= (Integer)var8.id_protected().id_break[id_protected[7]]) {
            return id_throws[1];
         }
      }

      return id_throws[2];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2105072063;
   }

   private void id_throws() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_throws[3]];
         Object[] var1 = this.id_byte;
      }
   }

   private static void id_catch() {
      id_protected = new short[]{0, 0, 0, 1, 2, 0, 1, 2};
   }

   private static void id_case() {
      id_throws = new boolean[]{false, true, false, true};
   }
}

package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bl_3 implements rY_2 {
   private static short[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static String[] id_protected;
   private static boolean[] id_throws;

   @Override
   public rY_2 id_byte(rpr_3 var1, int var2) {
      return this.id_class(var1)
         ? new bl_3((rU_2)this.id_class[id_break[55]], ((rU_2)this.id_class[id_break[56]]).id_byte(var1, var2))
         : new bl_3(((rU_2)this.id_class[id_break[57]]).id_byte(var1, var2), (rU_2)this.id_class[id_break[58]]);
   }

   @Override
   public rU_2 id_byte() {
      return (rU_2)this.id_class[id_break[32]];
   }

   public bl_3(rU_2 var1, rU_2 var2) {
      this.id_extends();
      this.id_class[id_break[0]] = var1;
      this.id_class[id_break[1]] = var2;
      rU_2 var9 = new rU_2(
         Math.min((Integer)var1.id_break[id_break[2]], (Integer)var2.id_break[id_break[3]]),
         Math.min((Integer)var1.id_break[id_break[4]], (Integer)var2.id_break[id_break[5]]),
         Math.min((Integer)var1.id_break[id_break[6]], (Integer)var2.id_break[id_break[7]])
      );
      this.id_class[id_break[8]] = var9;
      rU_2 var10 = new rU_2(
         Math.max((Integer)var1.id_break[id_break[9]], (Integer)var2.id_break[id_break[10]]),
         Math.max((Integer)var1.id_break[id_break[11]], (Integer)var2.id_break[id_break[12]]),
         Math.max((Integer)var1.id_break[id_break[13]], (Integer)var2.id_break[id_break[14]])
      );
      this.id_class[id_break[15]] = var10;
      rja_3 var11 = new rja_3(
         (Integer)((rU_2)this.id_class[id_break[16]]).id_break[id_break[17]]
            - (Integer)((rU_2)this.id_class[id_break[18]]).id_break[id_break[19]]
            + id_throws[0],
         (Integer)((rU_2)this.id_class[id_break[20]]).id_break[id_break[21]]
            - (Integer)((rU_2)this.id_class[id_break[22]]).id_break[id_break[23]]
            + id_throws[1],
         (Integer)((rU_2)this.id_class[id_break[24]]).id_break[id_break[25]]
            - (Integer)((rU_2)this.id_class[id_break[26]]).id_break[id_break[27]]
            + id_throws[2]
      );
      this.id_class[id_break[28]] = var11;
      rfl_3 var12 = new rfl_3((rU_2)this.id_class[id_break[29]], ((rU_2)this.id_class[id_break[30]]).id_class(id_throws[3], id_throws[4], id_throws[5]));
      this.id_class[id_break[31]] = var12;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      String var10000 = id_protected[0];
      Object[] var10001 = new Object[id_byte[0]];
      var10001[id_throws[6]] = (rU_2)this.id_class[id_break[40]];
      var10001[id_throws[7]] = (rU_2)this.id_class[id_break[41]];
      return String.format(var10000, var10001);
   }

   @Override
   public int hashCode() {
      return ((rU_2)this.id_class[id_break[38]]).hashCode() ^ ((rU_2)this.id_class[id_break[39]]).hashCode();
   }

   @Override
   public rY_2 id_class(double var1) {
      return new bl_3(((rU_2)this.id_class[id_break[65]]).id_break(-var1, -var1, -var1), ((rU_2)this.id_class[id_break[66]]).id_break(var1, var1, var1));
   }

   @Override
   public rY_2 id_class(rpr_3 var1, int var2) {
      return new bl_3(((rU_2)this.id_class[id_break[63]]).id_byte(var1, var2), ((rU_2)this.id_class[id_break[64]]).id_byte(var1, var2));
   }

   private boolean id_class(rpr_3 var1) {
      boolean var2 = var1.id_throws().id_class() < 0 ? id_throws[8] : id_throws[9];
      switch (((int[])bH_2.id_class[id_break[42]])[var1.id_final().ordinal()]) {
         case 1:
            return (
                  ((rU_2)this.id_class[id_break[43]]).id_break[id_break[44]] > ((rU_2)this.id_class[id_break[45]]).id_break[id_break[46]]
                     ? id_throws[10]
                     : id_throws[11]
               )
               ^ var2;
         case 2:
            return (
                  ((rU_2)this.id_class[id_break[47]]).id_break[id_break[48]] > ((rU_2)this.id_class[id_break[49]]).id_break[id_break[50]]
                     ? id_throws[12]
                     : id_throws[13]
               )
               ^ var2;
         case 3:
            return (
                  ((rU_2)this.id_class[id_break[51]]).id_break[id_break[52]] > ((rU_2)this.id_class[id_break[53]]).id_break[id_break[54]]
                     ? id_throws[14]
                     : id_throws[15]
               )
               ^ var2;
         default:
            throw new IllegalStateException(id_protected[1]);
      }
   }

   @Override
   public rU_2 id_class() {
      return (rU_2)this.id_class[id_break[34]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2644885729471228972L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1471830779;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-118, -51, -98, 38, 75, -31, -21, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rY_2 id_break(double var1) {
      return this.id_class(-var1);
   }

   @Override
   public rfl_3 id_break() {
      return (rfl_3)this.id_class[id_break[37]];
   }

   @Override
   public rY_2 id_break(rpr_3 var1, int var2) {
      return this.id_class(var1)
         ? new bl_3(((rU_2)this.id_class[id_break[59]]).id_byte(var1, var2), (rU_2)this.id_class[id_break[60]])
         : new bl_3((rU_2)this.id_class[id_break[61]], ((rU_2)this.id_class[id_break[62]]).id_byte(var1, var2));
   }

   @Override
   public rja_3 id_throws() {
      return (rja_3)this.id_class[id_break[36]];
   }

   private static void id_finally() {
      id_byte = new byte[]{2, 6};
   }

   private static void id_catch() {
      id_protected = new String[]{new String("Selection{pos1=%s,pos2=%s}"), new String("Bad Direction.Axis")};
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[1]];
         Object[] var1 = this.id_class;
      }
   }

   @Override
   public rU_2 id_case() {
      return (rU_2)this.id_class[id_break[33]];
   }

   private static void id_implements() {
      id_break = new short[]{
         0,
         1,
         0,
         0,
         1,
         1,
         2,
         2,
         2,
         0,
         0,
         1,
         1,
         2,
         2,
         3,
         3,
         0,
         2,
         0,
         3,
         1,
         2,
         1,
         3,
         2,
         2,
         2,
         4,
         2,
         3,
         5,
         0,
         1,
         2,
         3,
         4,
         5,
         0,
         1,
         0,
         1,
         0,
         1,
         0,
         0,
         0,
         1,
         1,
         0,
         1,
         1,
         2,
         0,
         2,
         0,
         1,
         0,
         1,
         0,
         1,
         0,
         1,
         0,
         1,
         0,
         1
      };
   }

   @Override
   public rU_2 id_protected() {
      return (rU_2)this.id_class[id_break[35]];
   }

   private static void id_private() {
      id_throws = new boolean[]{true, true, true, true, true, true, false, true, true, false, true, false, true, false, true, false};
   }
}

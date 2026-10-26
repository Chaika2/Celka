package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GZ extends rE_2 {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_break;
   private static short[] id_throws;
   private static int[] id_case;
   private static String[] id_catch;

   private static void id_byte() {
      id_catch = new String[]{new String("GoalAdjacent{x=%s,y=%s,z=%s}")};
   }

   public GZ(rfH_2 var1, rfH_2 var2, boolean var3) {
      super(var1);
      this.id_catch();
      this.id_break[id_throws[0]] = var2;
      Boolean var9 = var3;
      this.id_break[id_throws[1]] = var9;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      this.id_catch();
      if (!super.equals(var1)) {
         return id_protected[6];
      } else {
         GZ var2 = (GZ)var1;
         return this.id_break[id_throws[12]] == var2.id_break[id_throws[13]]
               && Objects.equals((rfH_2)this.id_break[id_throws[14]], (rfH_2)var2.id_break[id_throws[15]])
            ? id_protected[7]
            : id_protected[8];
      }
   }

   @Override
   public String toString() {
      String var10000 = id_catch[0];
      Object[] var10001 = new Object[id_byte[1]];
      var10001[id_protected[9]] = Pd_1.id_class((Integer)this.id_class[id_throws[20]]);
      var10001[id_protected[10]] = Pd_1.id_class((Integer)this.id_class[id_throws[21]]);
      var10001[id_byte[2]] = Pd_1.id_class((Integer)this.id_class[id_throws[22]]);
      return String.format(var10000, var10001);
   }

   @Override
   public int hashCode() {
      this.id_catch();
      int var1 = id_case[0];
      var1 = var1 * id_case[1] + super.hashCode();
      var1 = var1 * id_case[2]
         + (int)rU_2.id_byte(((rfH_2)this.id_break[id_throws[16]]).b_(), ((rfH_2)this.id_break[id_throws[17]]).c_(), ((rfH_2)this.id_break[id_throws[18]]).d_());
      return var1 * id_case[3] + (this.id_break[id_throws[19]] ? id_case[4] : id_case[5]);
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      return (double)((Integer)this.id_class[id_throws[11]] * id_byte[0]) + super.id_class(var1, var2, var3);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 744258569;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -891718153692355820L;
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      this.id_catch();
      if (var1 == (Integer)this.id_class[id_throws[2]] && var2 == (Integer)this.id_class[id_throws[3]] && var3 == (Integer)this.id_class[id_throws[4]]) {
         return id_protected[0];
      } else if (var1 == ((rfH_2)this.id_break[id_throws[5]]).b_()
         && var2 == ((rfH_2)this.id_break[id_throws[6]]).c_()
         && var3 == ((rfH_2)this.id_break[id_throws[7]]).d_()) {
         return id_protected[1];
      } else if (!(Boolean)this.id_break[id_throws[8]] && var2 == (Integer)this.id_class[id_throws[9]] - id_protected[2]) {
         return id_protected[3];
      } else {
         return var2 < this.id_class[id_throws[10]] - id_protected[4] ? id_protected[5] : super.id_break(var1, var2, var3);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{87, 23, -60, -9, 88, 11, -48, 33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_byte = new byte[]{100, 3, 2, 2};
   }

   private void id_catch() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[3]];
         Object[] var1 = this.id_break;
         var1[id_protected[11]] = id_protected[12];
      }
   }

   private static void id_case() {
      id_throws = new short[]{1, 0, 0, 1, 2, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 2};
   }

   private static void id_protected() {
      id_case = new int[]{806368046, 1412661222, 1730799370, 260592149, -1314802005, 1565710265};
   }

   private static void id_private() {
      id_protected = new boolean[]{false, false, true, false, true, false, false, true, false, false, true, false, false};
   }
}

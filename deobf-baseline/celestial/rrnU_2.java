package celestial;

import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record rrnU_2() implements Comparator<iB_2> {
   public AttackAura id_class;
   private static short[] id_break;
   private static String[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_throws = new boolean[]{true, false, true, false, false, true};
   }

   rrnU_2(AttackAura var1) {
      this.id_class = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7117211118422648148L;
   }

   public int id_class(iB_2 var1, iB_2 var2) {
      if (this.id_class.id_short()) {
         return ComparisonChain.start()
            .compareTrueFirst(
               var1.id_class(rXQ.CHEST).id_break() == rdy_3.hz ? id_throws[0] : id_throws[1],
               var2.id_class(rXQ.CHEST).id_break() == rdy_3.hz ? id_throws[2] : id_throws[3]
            )
            .compare(
               var2.id_while((cb_3)MinecraftAccessor.id_import.id_class[id_break[0]]), var1.id_while((cb_3)MinecraftAccessor.id_import.id_class[id_break[1]])
            )
            .compare(
               ((cb_3)MinecraftAccessor.id_import.id_class[id_break[2]]).id_protected(var1),
               ((cb_3)MinecraftAccessor.id_import.id_class[id_break[3]]).id_protected(var2)
            )
            .result();
      } else {
         String var3 = this.id_class.id_interface().id_byte();
         byte var4 = id_protected[0];
         switch (var3.hashCode()) {
            case -1397728228:
               if (var3.equals(id_byte[0])) {
                  var4 = id_throws[4];
               }
               break;
            case 968900751:
               if (var3.equals(id_byte[2])) {
                  var4 = id_protected[1];
               }
               break;
            case 1835963915:
               if (var3.equals(id_byte[1])) {
                  var4 = id_throws[5];
               }
         }
         return switch (var4) {
            case 0 -> Float.compare(var1.u_(), var2.u_());
            case 1 -> Double.compare(
            ((cb_3)MinecraftAccessor.id_import.id_class[id_break[4]]).id_protected(var1),
            ((cb_3)MinecraftAccessor.id_import.id_class[id_break[5]]).id_protected(var2)
         );
            case 2 -> (int)(
            Math.abs(PJ.id_break(var1) - (Float)((cb_3)MinecraftAccessor.id_import.id_class[id_break[6]]).id_throws[id_break[7]])
               - Math.abs(PJ.id_break(var2) - (Float)((cb_3)MinecraftAccessor.id_import.id_class[id_break[8]]).id_throws[id_break[9]])
         );
            default -> ComparisonChain.start()
            .compare(var1.BN(), var2.BN())
            .compare(-var1.Bq(), -var2.Bq())
            .compare(var1.u_(), var2.u_())
            .compare(
               ((cb_3)MinecraftAccessor.id_import.id_class[id_break[10]]).id_protected(var1),
               ((cb_3)MinecraftAccessor.id_import.id_class[id_break[11]]).id_protected(var2)
            )
            .result();
         };
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 912319092;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-59, -31, -90, 89, 23, -92, 121, -90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_protected = new byte[]{-1, 2};
   }

   private static void id_throws() {
      id_byte = new String[]{new String("Здоровье"), new String("Дистанция"), new String("Поле зрения")};
   }

   private static void id_protected() {
      id_break = new short[]{57, 57, 57, 57, 57, 57, 57, 15, 57, 15, 57, 57};
   }
}

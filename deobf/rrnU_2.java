package celestial;

import celestial.module.combat.AttackAura;
import celestial.util.MinecraftAccessor;
import com.google.common.collect.ComparisonChain;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnU_2 extends Record implements Comparator<iB_2> {
   public AttackAura id_class;
   private static short[] id_break;
   private static String[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_throws = new boolean[]{true, false, true, false, false, true};
   }

   public rrnU_2(AttackAura var1) {
      this.id_class = var1;
   }

   static {
      ntfClinit();
   }

   public boolean equals(Object var1) {
      return this.equals<invokedynamic>(this, var1);
   }

   public String toString() {
      return this.toString<invokedynamic>(this);
   }

   public int hashCode() {
      return this.hashCode<invokedynamic>(this);
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.id_class((iB_2)var1, (iB_2)var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7117211118422648148L;
   }

   public AttackAura id_class() {
      return this.id_class;
   }

   public int id_class(iB_2 var1, iB_2 var2) {
      if (this.id_class.id_short()) {
         return ComparisonChain.start().compareTrueFirst(var1.id_class(rXQ.CHEST).id_break() == rdy_3.hz ? true : false, var2.id_class(rXQ.CHEST).id_break() == rdy_3.hz ? true : false).compare(var2.id_while((cb_3)MinecraftAccessor.id_import.id_class[57]), var1.id_while((cb_3)MinecraftAccessor.id_import.id_class[57])).compare(((cb_3)MinecraftAccessor.id_import.id_class[57]).id_protected(var1), ((cb_3)MinecraftAccessor.id_import.id_class[57]).id_protected(var2)).result();
      } else {
         String var3 = (String)this.id_class.id_interface().id_byte();
         byte var4 = -1;
         switch (var3.hashCode()) {
            case -1397728228:
               if (var3.equals(new String("Здоровье"))) {
                  var4 = false;
               }
               break;
            case 968900751:
               if (var3.equals(new String("Поле зрения"))) {
                  var4 = 2;
               }
               break;
            case 1835963915:
               if (var3.equals(new String("Дистанция"))) {
                  var4 = true;
               }
         }

         int var10000;
         switch (var4) {
            case 0 -> var10000 = Float.compare(var1.u_(), var2.u_());
            case 1 -> var10000 = Double.compare(((cb_3)MinecraftAccessor.id_import.id_class[57]).id_protected(var1), ((cb_3)MinecraftAccessor.id_import.id_class[57]).id_protected(var2));
            case 2 -> var10000 = (int)(Math.abs(PJ.id_break(var1) - (Float)((cb_3)MinecraftAccessor.id_import.id_class[57]).id_throws[15]) - Math.abs(PJ.id_break(var2) - (Float)((cb_3)MinecraftAccessor.id_import.id_class[57]).id_throws[15]));
            default -> var10000 = ComparisonChain.start().compare(var1.BN(), var2.BN()).compare(-var1.Bq(), -var2.Bq()).compare(var1.u_(), var2.u_()).compare(((cb_3)MinecraftAccessor.id_import.id_class[57]).id_protected(var1), ((cb_3)MinecraftAccessor.id_import.id_class[57]).id_protected(var2)).result();
         }

         return var10000;
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

   // $FF: synthetic method
   private static void ntfClinit() {
      id_byte();
      id_throws();
      id_protected();
      id_break();
   }

   private static void id_protected() {
      id_break = new short[]{57, 57, 57, 57, 57, 57, 57, 15, 57, 15, 57, 57};
   }
}

package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrfL_2 implements MinecraftAccessor {
   public Object[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static String[] id_throws;

   private static void id_byte() {
      id_break = new boolean[1];
   }

   public rrfL_2() {
      this.id_throws();
      ArrayList var5 = new ArrayList();
      this.id_class[0] = var5;
      Comparator var6 = Comparator.comparingInt(var1 -> -((List)this.id_class[0]).indexOf(var1.getKey()));
      this.id_class[1] = var6;
   }

   static {
      ntfClinit();
   }

   public Pair<String, Integer> id_class(rdn_3 var1) {
      StringBuilder var2 = new StringBuilder();
      Map var3 = ((List)this.id_class[0]).isEmpty() ? var1.id_static() : var1.id_class((List<ev_3>)this.id_class[0]);
      var3.entrySet()
         .stream()
         .sorted((Comparator)this.id_class[1])
         .forEach(var2x -> var2.append(this.id_class((ev_3)var2x.getKey(), (Integer)var2x.getValue(), 0, 2)).append("\n"));
      return Pair.of(var2.toString(), var3.size());
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-42, 77, 33, -63, -15, -109, 19, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrfL_2 id_class(Comparator<Entry<ev_3, Integer>> var1) {
      this.id_class[1] = var1;
      return this;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1840660222102227268L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 796712611;
   }

   private static void id_class() {
      id_throws = new String[]{new String("\n")};
   }

   public String id_class(ev_3 var1, int var2, int var3, int var4) {
      rgn_3 var5 = new rgn_3(var1.id_catch());
      return var5.getString().substring(var3, var4) + var2;
   }

   public rrfL_2 id_class(ev_3... var1) {
      List var6 = List.of(var1);
      this.id_class[0] = var6;
      return this;
   }

   private static void id_break() {
      id_byte = new byte[]{2, 2};
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
      }
   }

   private static void id_protected() {
      id_protected = new short[]{0, 1, 0, 0, 1, 0, 1, 0};
   }
}

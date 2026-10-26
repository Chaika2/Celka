package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrTs_1 {
   public Object[] fields535ba6477b2d307ba91b4de7d306c5df;
   private static byte[] bytes535ba6477b2d307ba91b4de7d306c5df;
   private static boolean[] booleans535ba6477b2d307ba91b4de7d306c5df;
   private static short[] shorts535ba6477b2d307ba91b4de7d306c5df;
   public static Object[] staticFields535ba6477b2d307ba91b4de7d306c5df;
   private static String[] strings535ba6477b2d307ba91b4de7d306c5df;

   private rrTs_1() {
      this.id_finally();
      ArrayList var7 = new ArrayList();
      this.fields535ba6477b2d307ba91b4de7d306c5df[0] = var7;
      this.id_implements();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1112991801;
   }

   public List<rrTB> id_class() {
      return (List<rrTB>)this.fields535ba6477b2d307ba91b4de7d306c5df[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 445204965468831154L;
   }

   public void id_class(rrTB... var1) {
      ((List)this.fields535ba6477b2d307ba91b4de7d306c5df[0]).addAll(List.of(var1));
      ((List)this.fields535ba6477b2d307ba91b4de7d306c5df[0])
         .sort(
            Comparator.comparingInt(
               var0 -> (int)(-((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally().id_break(var0.id_throws()))
            )
         );
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 94, 25, 65, 69, 9, -7, 27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Map<rrTS, List<rrTB>> id_break() {
      HashMap var1 = new HashMap();

      for (rrTB var3 : (List)this.fields535ba6477b2d307ba91b4de7d306c5df[0]) {
         var1.computeIfAbsent(var3.id_class(), var0 -> new ArrayList<>()).add(var3);
      }

      return var1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(var0 -> -((List)var0.getValue()).size()))
         .collect(LinkedHashMap::new, (var0, var1x) -> var0.put((rrTS)var1x.getKey(), (List<rrTB>)var1x.getValue()), Map::putAll);
   }

   private static void id_throws() {
      strings535ba6477b2d307ba91b4de7d306c5df = new String[]{new String("INSTANCE")};
   }

   private void id_finally() {
      if (this.fields535ba6477b2d307ba91b4de7d306c5df == null) {
         this.fields535ba6477b2d307ba91b4de7d306c5df = new Object[1];
      }
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrTs_1(), null};
      var0[1] = new rrTs_1[]{(rrTs_1)var0[0]};
      staticFields535ba6477b2d307ba91b4de7d306c5df = var0;
   }

   private static void id_case() {
      shorts535ba6477b2d307ba91b4de7d306c5df = new short[]{1, 0, 0, 0, 0, 0, 0, 0};
   }

   private void id_implements() {
      this.id_class(new rrTk_1(), new rrTO(), new rrTd_1(), new rrTJ(), new rrTX(), new rrTh_1(), new rrTx_1());
   }

   private static void id_protected() {
      booleans535ba6477b2d307ba91b4de7d306c5df = new boolean[]{false, true, true, false, false, false, true, true};
   }

   private static void id_private() {
      bytes535ba6477b2d307ba91b4de7d306c5df = new byte[]{7, 2, 3, 4, 5, 6, 2};
   }
}

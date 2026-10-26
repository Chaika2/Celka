package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sy_3 extends C_try {
   private static boolean[] id_break;
   private static short[] id_throws;
   private static String[] id_case;
   private static byte[] id_catch;
   private static int[] id_private;

   public sy_3(C_case var1) {
      String[] var10002 = new String[1];
      var10002[id_break[1]] = id_case[0];
      super(var1, var10002);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      var2.id_private(1);
      ArrayList var3 = new ArrayList();

      while (var2.id_final()) {
         var3.add((xd_3)var2.id_break((C_short)C_short.staticFields527f5e1fd5d43b2790a2d9e0b8d76cee[id_throws[0]]));
      }

      rU_2 var4 = ((Ps_1)this.id_class[1]).id_volatile();
      rVe_1[] var5 = var3.stream()
         .flatMap(
            var2x -> ((Ps_1)this.id_class[1])
                  .id_package()
                  .id_break()
                  .id_class(rVL.id_strictfp.id_break(var2x).id_break(), Integer.MAX_VALUE, (Integer)var4.id_break[id_throws[7]], (Integer)var4.id_break[1], 4)
                  .stream()
         )
         .map(rU_2::new)
         .map(this::id_class)
         .toArray(rVe_1[]::new);
      if (var5.length > 0) {
         Arrays.asList(var5).forEach(var1x -> {
            rVi_1[] var10001 = new rVi_1[1];
            var10001[id_break[10]] = var1x;
            this.id_class(var10001);
         });
      } else {
         this.id_case(id_case[1]);
      }
   }

   private rgP_2 id_class(rU_2 var1) {
      String var10000 = id_case[2];
      Object[] var10001 = new Object[3];
      var10001[id_break[3]] = (Integer)var1.id_break[id_throws[2]];
      var10001[1] = (Integer)var1.id_break[1];
      var10001[2] = (Integer)var1.id_break[2];
      String var2 = String.format(var10000, var10001);
      var10000 = id_case[3];
      var10001 = new Object[2];
      var10001[id_break[5]] = C_throw.id_class;
      var10001[1] = var2;
      String var3 = String.format(var10000, var10001);
      rgN_2 var4 = new rgN_2(var1.toString());
      rgN_2 var5 = new rgN_2(id_case[4]);
      var4.id_class(var4.id_class().id_class(rgF_2.GRAY).id_class(var2).id_class(new rgl_3(rgH_2.RUN_COMMAND, var3)).id_class(new rgy_3(rgp_3.id_class, var5)));
      return var4;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4554528706868903580L;
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      return new v_1()
         .id_break(((ImmutableSet)St_1.id_class[id_throws[5]]).stream().map(rVL.id_strictfp::id_break).map(Object::toString))
         .id_break(var2.id_extends())
         .id_break()
         .id_protected();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -71, 92, -117, 105, -62, -89, -95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -925919029;
   }

   private static void id_throws() {
      id_break = new boolean[]{true, false, true, false, true, false, true, false, true, true, false};
   }

   private static void id_finally() {
      id_private = new int[]{Integer.MAX_VALUE};
   }

   @Override
   public List<String> id_catch() {
      String[] var10000 = new String[5];
      var10000[id_break[7]] = id_case[6];
      var10000[1] = id_case[7];
      var10000[2] = id_case[8];
      var10000[3] = id_case[9];
      var10000[4] = id_case[10];
      return Arrays.asList(var10000);
   }

   private static void id_extends() {
      id_throws = new short[]{0, 1, 0, 1, 2, 0, 1, 0, 1};
   }

   @Override
   public String id_implements() {
      return id_case[5];
   }

   private static void id_protected() {
      id_case = new String[]{
         new String("find"),
         new String("No positions known, are you sure the blocks are cached?"),
         new String("%s %s %s"),
         new String("%sgoal %s"),
         new String("Click to set goal to this position"),
         new String("Find positions of a certain block"),
         new String("The find command searches through Baritone's cache and attempts to find the location of the block."),
         new String("Tab completion will suggest only cached blocks and uncached blocks can not be found."),
         new String(""),
         new String("Usage:"),
         new String("> find <block> [...] - Try finding the listed blocks")
      };
   }

   private static void id_native() {
      id_catch = new byte[]{3, 2, 2, 5, 2, 3, 4, 4};
   }
}

package celestial;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.zip.ZipException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzY_2 extends rrzi_3 implements rrzt_3 {
   private static byte[] id_throws;
   private static boolean[] id_case;
   private static long[] id_catch;
   private static String[] id_private;
   private static short[] id_implements;
   public Object[] id_class;
   private static int[] id_finally;
   public static Object[] id_break;

   int id_byte(OutputStream var1) throws IOException {
      this.id_final();
      rrQO.id_break(var1, (Long)rrzH_2.id_class[id_implements[169]]);
      rrQO.id_break(var1, (Long)this.id_class[id_implements[170]]);
      if ((Long)this.id_class[id_implements[171]] < id_catch[47] && (Long)this.id_class[id_implements[172]] < id_catch[48]) {
         rrQO.id_break(var1, (Long)this.id_class[id_implements[175]]);
         rrQO.id_break(var1, (Long)this.id_class[id_implements[176]]);
         return id_throws[43];
      } else {
         rrQO.id_class(var1, (Long)this.id_class[id_implements[173]]);
         rrQO.id_class(var1, (Long)this.id_class[id_implements[174]]);
         return id_throws[42];
      }
   }

   @Override
   public byte[] id_byte() {
      this.id_final();
      return (byte[])this.id_class[id_implements[226]] != null
         ? Arrays.copyOf((byte[])this.id_class[id_implements[227]], ((byte[])this.id_class[id_implements[228]]).length)
         : null;
   }

   private static void id_int() {
      id_implements = new short[]{
         2,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         2,
         8,
         9,
         7,
         10,
         12,
         11,
         6,
         2,
         5,
         1,
         6,
         2,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         0,
         2,
         2,
         3,
         3,
         9,
         9,
         8,
         8,
         7,
         7,
         10,
         10,
         12,
         12,
         11,
         11,
         6,
         6,
         13,
         13,
         14,
         14,
         15,
         15,
         5,
         5,
         2,
         2,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         6,
         6,
         5,
         768,
         255,
         21,
         3,
         3,
         4,
         6,
         7,
         10,
         11,
         12,
         4095,
         5,
         14,
         0,
         0,
         2,
         2,
         1,
         1,
         13,
         15,
         11,
         12,
         14,
         2,
         0,
         0,
         13,
         13,
         15,
         15,
         11,
         12,
         14,
         13,
         13,
         21589,
         0,
         12,
         4,
         6,
         7,
         10,
         15,
         5,
         5,
         12,
         11,
         14,
         7,
         8,
         9,
         21589,
         9,
         7,
         13,
         13,
         15,
         15,
         2,
         0,
         0,
         13,
         13,
         10,
         4,
         4,
         6,
         7,
         11,
         12,
         4,
         6,
         7,
         10,
         11,
         12,
         13,
         13,
         21589,
         0,
         8,
         9,
         12,
         11,
         7,
         8,
         9,
         21589,
         8,
         9,
         7,
         8,
         8,
         9,
         9,
         13,
         13,
         11,
         10,
         11,
         12,
         11,
         12,
         11,
         12,
         13,
         13,
         13,
         13,
         12,
         13,
         12,
         11,
         13,
         11,
         14,
         13,
         14,
         13,
         13,
         13,
         7,
         13,
         8,
         13,
         9,
         6,
         13,
         7,
         14,
         13,
         13,
         13,
         13,
         13,
         13,
         14,
         14,
         21589,
         7,
         8,
         9,
         1024,
         9,
         7,
         9,
         8,
         7,
         8,
         7,
         12,
         11,
         10,
         6,
         13,
         13,
         13,
         15,
         15,
         15,
         5,
         5
      };
   }

   public rrzY_2(rrzf_3 var1, rrzi_3 var2) throws IOException {
      this.id_final();
      Integer var7 = Integer.valueOf(id_case[5]);
      this.id_class[id_implements[58]] = var7;
      Integer var8 = Integer.valueOf(id_throws[4]);
      this.id_class[id_implements[59]] = var8;
      Integer var9 = Integer.valueOf(id_throws[5]);
      this.id_class[id_implements[60]] = var9;
      Long var10 = id_catch[15];
      this.id_class[id_implements[61]] = var10;
      Long var11 = id_catch[16];
      this.id_class[id_implements[62]] = var11;
      Long var12 = id_catch[17];
      this.id_class[id_implements[63]] = var12;
      Long var13 = id_catch[18];
      this.id_class[id_implements[64]] = var13;
      Long var14 = id_catch[19];
      this.id_class[id_implements[65]] = var14;
      Long var15 = id_catch[20];
      this.id_class[id_implements[66]] = var15;
      this.id_class(var1, var2);
   }

   public rrzY_2(byte[] var1, boolean var2, int var3) {
      this.id_final();
      Integer var8 = Integer.valueOf(id_case[0]);
      this.id_class[id_implements[0]] = var8;
      Integer var9 = Integer.valueOf(id_throws[0]);
      this.id_class[id_implements[1]] = var9;
      Integer var10 = Integer.valueOf(id_throws[1]);
      this.id_class[id_implements[2]] = var10;
      Long var11 = id_catch[0];
      this.id_class[id_implements[3]] = var11;
      Long var12 = id_catch[1];
      this.id_class[id_implements[4]] = var12;
      Long var13 = id_catch[2];
      this.id_class[id_implements[5]] = var13;
      Long var14 = id_catch[3];
      this.id_class[id_implements[6]] = var14;
      Long var15 = id_catch[4];
      this.id_class[id_implements[7]] = var15;
      Long var16 = id_catch[5];
      this.id_class[id_implements[8]] = var16;
      this.id_break(var1);
      Boolean var17 = var2;
      this.id_protected[id_implements[9]] = var17;
      long var10004 = System.currentTimeMillis();
      Long var18 = var10004;
      this.id_class[id_implements[10]] = var18;
      Long var19 = var10004;
      this.id_class[id_implements[11]] = var19;
      Long var20 = var10004;
      this.id_class[id_implements[12]] = var20;
      Long var21 = id_catch[6];
      this.id_class[id_implements[13]] = var21;
      Long var22 = id_catch[7];
      this.id_class[id_implements[14]] = var22;
      Long var23 = id_catch[8];
      this.id_class[id_implements[15]] = var23;
      Integer var24 = var3;
      this.id_class[id_implements[16]] = var24;
   }

   public rrzY_2(rrzY_2 var1, int var2, int var3) {
      this(var1, var2);
      Integer var8 = var3;
      this.id_class[id_implements[20]] = var8;
   }

   public rrzY_2(byte[] var1, Path var2, int var3, FileAttribute<?>... var4) {
      this(var1, var3, id_case[2], id_case[3], var4);
      this.id_class[id_implements[19]] = var2;
   }

   public rrzY_2(byte[] var1, int var2, boolean var3, int var4, FileAttribute<?>... var5) {
      this(var1, var3, var4);
      Integer var15 = var2;
      this.id_class[id_implements[17]] = var15;
      FileAttribute[] var6 = var5;
      int var7 = var5.length;

      for (int var8 = id_case[1]; var8 < var7; var8++) {
         FileAttribute var9 = var6[var8];
         String var10 = var9.name();
         if (var10.equals(id_private[0])) {
            Integer var16 = rrQO.id_class((Set<PosixFilePermission>)var9.value());
            this.id_class[id_implements[18]] = var16;
         }
      }
   }

   public rrzY_2(rrzY_2 var1, int var2) {
      this.id_final();
      Integer var7 = Integer.valueOf(id_case[4]);
      this.id_class[id_implements[21]] = var7;
      Integer var8 = Integer.valueOf(id_throws[2]);
      this.id_class[id_implements[22]] = var8;
      Integer var9 = Integer.valueOf(id_throws[3]);
      this.id_class[id_implements[23]] = var9;
      Long var10 = id_catch[9];
      this.id_class[id_implements[24]] = var10;
      Long var11 = id_catch[10];
      this.id_class[id_implements[25]] = var11;
      Long var12 = id_catch[11];
      this.id_class[id_implements[26]] = var12;
      Long var13 = id_catch[12];
      this.id_class[id_implements[27]] = var13;
      Long var14 = id_catch[13];
      this.id_class[id_implements[28]] = var14;
      Long var15 = id_catch[14];
      this.id_class[id_implements[29]] = var15;
      this.id_break((byte[])var1.id_protected[id_implements[30]]);
      Boolean var16 = (Boolean)var1.id_protected[id_implements[31]];
      this.id_protected[id_implements[32]] = var16;
      Integer var17 = (Integer)var1.id_class[id_implements[33]];
      this.id_class[id_implements[34]] = var17;
      Long var18 = (Long)var1.id_class[id_implements[35]];
      this.id_class[id_implements[36]] = var18;
      Long var19 = (Long)var1.id_class[id_implements[37]];
      this.id_class[id_implements[38]] = var19;
      Long var20 = (Long)var1.id_class[id_implements[39]];
      this.id_class[id_implements[40]] = var20;
      Long var21 = (Long)var1.id_class[id_implements[41]];
      this.id_class[id_implements[42]] = var21;
      Long var22 = (Long)var1.id_class[id_implements[43]];
      this.id_class[id_implements[44]] = var22;
      Long var23 = (Long)var1.id_class[id_implements[45]];
      this.id_class[id_implements[46]] = var23;
      Integer var24 = (Integer)var1.id_class[id_implements[47]];
      this.id_class[id_implements[48]] = var24;
      byte[] var25 = (byte[])var1.id_class[id_implements[49]];
      this.id_class[id_implements[50]] = var25;
      Long var26 = (Long)var1.id_class[id_implements[51]];
      this.id_class[id_implements[52]] = var26;
      byte[] var27 = (byte[])var1.id_class[id_implements[53]];
      this.id_class[id_implements[54]] = var27;
      Integer var28 = (Integer)var1.id_class[id_implements[55]];
      this.id_class[id_implements[56]] = var28;
      Integer var29 = var2;
      this.id_class[id_implements[57]] = var29;
   }

   static {
      ntfClinit();
   }

   @Override
   public long size() {
      this.id_final();
      return (Long)this.id_class[id_implements[222]];
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(id_implements[214]);
      Formatter var2 = new Formatter(var1);
      String var10001 = id_private[5];
      Object[] var10002 = new Object[id_case[52]];
      var10002[id_case[53]] = this.id_private();
      var2.format(var10001, var10002);
      var10001 = id_private[6];
      var10002 = new Object[id_case[54]];
      var10002[id_case[55]] = this.creationTime().toMillis();
      var2.format(var10001, var10002);
      var10001 = id_private[7];
      var10002 = new Object[id_case[56]];
      var10002[id_case[57]] = this.lastAccessTime().toMillis();
      var2.format(var10001, var10002);
      var10001 = id_private[8];
      var10002 = new Object[id_case[58]];
      var10002[id_case[59]] = this.lastModifiedTime().toMillis();
      var2.format(var10001, var10002);
      var10001 = id_private[9];
      var10002 = new Object[id_case[60]];
      var10002[id_case[61]] = this.isRegularFile();
      var2.format(var10001, var10002);
      var10001 = id_private[10];
      var10002 = new Object[id_case[62]];
      var10002[id_case[63]] = this.isDirectory();
      var2.format(var10001, var10002);
      var10001 = id_private[11];
      var10002 = new Object[id_case[64]];
      var10002[id_case[65]] = this.isSymbolicLink();
      var2.format(var10001, var10002);
      var10001 = id_private[12];
      var10002 = new Object[id_case[66]];
      var10002[id_case[67]] = this.isOther();
      var2.format(var10001, var10002);
      var10001 = id_private[13];
      var10002 = new Object[id_case[68]];
      var10002[id_case[69]] = this.fileKey();
      var2.format(var10001, var10002);
      var10001 = id_private[14];
      var10002 = new Object[id_case[70]];
      var10002[id_case[71]] = this.size();
      var2.format(var10001, var10002);
      var10001 = id_private[15];
      var10002 = new Object[id_case[72]];
      var10002[id_case[73]] = this.id_protected();
      var2.format(var10001, var10002);
      var10001 = id_private[16];
      var10002 = new Object[id_case[74]];
      var10002[id_case[75]] = this.id_case();
      var2.format(var10001, var10002);
      var10001 = id_private[17];
      var10002 = new Object[id_case[76]];
      var10002[id_case[77]] = this.id_break();
      var2.format(var10001, var10002);
      Set var3 = this.id_class().orElse(null);
      if (var3 != null) {
         var10001 = id_private[18];
         var10002 = new Object[id_case[78]];
         var10002[id_case[79]] = var3;
         var2.format(var10001, var10002);
      }

      var2.close();
      return var1.toString();
   }

   private void id_class(rrzf_3 var1, rrzi_3 var2) throws IOException {
      this.id_final();
      byte[] var3 = (byte[])var1.id_break[id_implements[72]];
      int var4 = (Integer)var2.id_protected[id_implements[73]];
      if (!rrzH_2.id_break(var3, var4)) {
         throw new ZipException(id_private[2]);
      } else {
         Integer var12 = rrzH_2.id_interface(var3, var4);
         this.id_class[id_implements[74]] = var12;
         Integer var13 = rrzH_2.id_else(var3, var4);
         this.id_class[id_implements[75]] = var13;
         Integer var14 = rrzH_2.id_synchronized(var3, var4);
         this.id_class[id_implements[76]] = var14;
         Long var15 = rrQO.id_break(rrzH_2.id_volatile(var3, var4));
         this.id_class[id_implements[77]] = var15;
         Long var16 = rrzH_2.id_protected(var3, var4);
         this.id_class[id_implements[78]] = var16;
         Long var17 = rrzH_2.id_finally(var3, var4);
         this.id_class[id_implements[79]] = var17;
         Long var18 = rrzH_2.id_int(var3, var4);
         this.id_class[id_implements[80]] = var18;
         int var5 = rrzH_2.id_super(var3, var4);
         int var6 = rrzH_2.id_instanceof(var3, var4);
         int var7 = rrzH_2.id_implements(var3, var4);
         if (rrzH_2.id_private(var3, var4) == id_throws[10]) {
            Integer var19 = rrzH_2.id_byte(var3, var4) & id_implements[81];
            this.id_class[id_implements[82]] = var19;
         }

         Long var20 = rrzH_2.id_throw(var3, var4);
         this.id_class[id_implements[83]] = var20;
         var4 += 46;
         byte[] var21 = (byte[])var2.id_protected[id_implements[84]];
         this.id_protected[id_implements[85]] = var21;
         Boolean var22 = (Boolean)var2.id_protected[id_implements[86]];
         this.id_protected[id_implements[87]] = var22;
         Integer var23 = (Integer)var2.id_protected[id_implements[88]];
         this.id_protected[id_implements[89]] = var23;
         var4 += var5;
         if (var6 > 0) {
            byte[] var24 = Arrays.copyOfRange(var3, var4, var4 + var6);
            this.id_class[id_implements[90]] = var24;
            var4 += var6;
            this.id_break(var1);
         }

         if (var7 > 0) {
            byte[] var25 = Arrays.copyOfRange(var3, var4, var4 + var7);
            this.id_class[id_implements[91]] = var25;
         }
      }
   }

   int id_class(OutputStream var1) throws IOException {
      this.id_final();
      long var2 = (Long)this.id_class[id_implements[92]];
      long var4 = (Long)this.id_class[id_implements[93]];
      long var6 = (Long)this.id_class[id_implements[94]];
      byte var8 = id_case[6];
      byte var9 = id_case[7];
      byte var10 = id_case[8];
      boolean var11 = id_case[9];
      byte[] var12 = this.id_protected[id_implements[95]]
         ? rrQO.id_class((byte[])this.id_protected[id_implements[96]])
         : (byte[])this.id_protected[id_implements[97]];
      int var13 = var12 != null ? var12.length - id_case[10] : id_case[11];
      int var14 = (byte[])this.id_class[id_implements[98]] != null ? ((byte[])this.id_class[id_implements[99]]).length : id_case[12];
      int var15 = id_case[13];
      int var16 = (byte[])this.id_class[id_implements[100]] != null ? ((byte[])this.id_class[id_implements[101]]).length : id_case[14];
      if ((Long)this.id_class[id_implements[102]] >= id_catch[21]) {
         var2 = id_catch[22];
         var8 += 8;
      }

      if ((Long)this.id_class[id_implements[103]] >= id_catch[23]) {
         var4 = id_catch[24];
         var8 += 8;
      }

      if ((Long)this.id_class[id_implements[104]] >= id_catch[25]) {
         var6 = id_catch[26];
         var8 += 8;
      }

      if (var8 != 0) {
         var8 += 4;
      }

      boolean var17 = var8 != 0 ? id_case[15] : id_case[16];
      int var18 = this.id_class(var17);

      while (var15 + id_throws[11] < var14) {
         int var19 = rrzH_2.id_while((byte[])this.id_class[id_implements[105]], var15);
         int var20 = rrzH_2.id_while((byte[])this.id_class[id_implements[106]], var15 + id_throws[12]);
         if (var19 == id_implements[107] || var19 == id_throws[13]) {
            var11 = id_case[17];
         }

         var15 += id_throws[14] + var20;
      }

      if (!var11) {
         if ((Boolean)rrzf_3.id_class[id_implements[108]]) {
            var9 = id_throws[15];
         } else {
            var10 = id_throws[16];
         }
      }

      rrQO.id_break(var1, (Long)rrzH_2.id_class[id_implements[109]]);
      rrQO.id_class(var1, this.id_break(var18));
      rrQO.id_class(var1, var18);
      rrQO.id_class(var1, (Integer)this.id_class[id_implements[110]]);
      rrQO.id_class(var1, (Integer)this.id_class[id_implements[111]]);
      rrQO.id_break(var1, (long)((int)rrQO.id_case((Long)this.id_class[id_implements[112]])));
      rrQO.id_break(var1, (Long)this.id_class[id_implements[113]]);
      rrQO.id_break(var1, var2);
      rrQO.id_break(var1, var4);
      rrQO.id_class(var1, var13);
      rrQO.id_class(var1, var14 + var8 + var9 + var10);
      if ((byte[])this.id_class[id_implements[114]] != null) {
         rrQO.id_class(var1, Math.min(var16, id_finally[0]));
      } else {
         rrQO.id_class(var1, id_case[18]);
      }

      rrQO.id_class(var1, id_case[19]);
      rrQO.id_class(var1, id_case[20]);
      rrQO.id_break(var1, this.id_class[id_implements[115]] > 0 ? (long)((Integer)this.id_class[id_implements[116]] << id_throws[17]) : id_catch[27]);
      rrQO.id_break(var1, var6);
      rrQO.id_class(var1, var12, id_case[21], var13);
      if (var17) {
         rrQO.id_class(var1, id_case[22]);
         rrQO.id_class(var1, var8 - id_throws[18]);
         if (var4 == id_catch[28]) {
            rrQO.id_class(var1, (Long)this.id_class[id_implements[117]]);
         }

         if (var2 == id_catch[29]) {
            rrQO.id_class(var1, (Long)this.id_class[id_implements[118]]);
         }

         if (var6 == id_catch[30]) {
            rrQO.id_class(var1, (Long)this.id_class[id_implements[119]]);
         }
      }

      if (var9 != 0) {
         rrQO.id_class(var1, id_throws[19]);
         rrQO.id_class(var1, var9 - id_throws[20]);
         rrQO.id_break(var1, id_catch[31]);
         rrQO.id_class(var1, id_case[23]);
         rrQO.id_class(var1, id_throws[21]);
         rrQO.id_class(var1, rrQO.id_class((Long)this.id_class[id_implements[120]]));
         rrQO.id_class(var1, rrQO.id_class((Long)this.id_class[id_implements[121]]));
         rrQO.id_class(var1, rrQO.id_class((Long)this.id_class[id_implements[122]]));
      }

      if (var10 != 0) {
         rrQO.id_class(var1, id_implements[123]);
         rrQO.id_class(var1, var10 - id_throws[22]);
         if ((Long)this.id_class[id_implements[124]] == id_catch[32]) {
            var1.write(id_throws[23]);
         } else {
            var1.write(id_throws[24]);
         }

         rrQO.id_break(var1, rrQO.id_byte((Long)this.id_class[id_implements[125]]));
      }

      if ((byte[])this.id_class[id_implements[126]] != null) {
         rrQO.id_class(var1, (byte[])this.id_class[id_implements[127]]);
      }

      if ((byte[])this.id_class[id_implements[128]] != null) {
         rrQO.id_class(var1, (byte[])this.id_class[id_implements[129]]);
      }

      return id_throws[25] + var13 + var14 + var16 + var8 + var9 + var10;
   }

   private int id_class(boolean var1) throws ZipException {
      this.id_final();
      if (var1) {
         return id_throws[6];
      } else if ((Integer)this.id_class[id_implements[67]] == id_throws[7]) {
         return id_throws[8];
      } else if ((Integer)this.id_class[id_implements[68]] == 0) {
         return id_throws[9];
      } else {
         throw new ZipException(id_private[1]);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{95, 88, -40, 53, -29, 0, -20, 109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Optional<Set<PosixFilePermission>> id_class() {
      this.id_final();
      HashSet var1 = null;
      if ((Integer)this.id_class[id_implements[232]] != id_throws[67]) {
         var1 = new HashSet(PosixFilePermission.values().length);
         PosixFilePermission[] var2 = PosixFilePermission.values();
         int var3 = var2.length;

         for (int var4 = id_case[84]; var4 < var3; var4++) {
            PosixFilePermission var5 = var2[var4];
            if (((Integer)this.id_class[id_implements[233]] & rrQO.id_class(var5)) != 0) {
               var1.add(var5);
            }
         }
      }

      return Optional.ofNullable(var1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1566707947;
   }

   private void id_class(rrzf_3 var1) throws IOException {
      this.id_final();
      byte[] var2 = new byte[id_throws[59]];
      if (var1.id_class(var2, id_case[46], (long)var2.length, (Long)this.id_class[id_implements[208]]) != (long)var2.length) {
         throw new ZipException(id_private[3]);
      } else if (!rrzH_2.id_new(var2, id_case[47])) {
         throw new ZipException("R" + Long.toString(rrzH_2.id_case(var2, id_case[48]), id_throws[60]));
      } else {
         int var3 = rrzH_2.id_volatile(var2);
         if (var3 >= id_throws[61]) {
            int var4 = rrzH_2.id_extends(var2);
            var2 = new byte[var3];
            if (var1.id_class(var2, id_case[49], (long)var2.length, (Long)this.id_class[id_implements[209]] + id_catch[53] + (long)var4) != (long)var2.length) {
               throw new ZipException(id_private[4]);
            } else {
               int var5 = id_case[50];

               while (var5 + id_throws[62] < var2.length) {
                  int var6 = rrzH_2.id_while(var2, var5);
                  int var7 = rrzH_2.id_while(var2, var5 + id_throws[63]);
                  var5 += 4;
                  if (var6 == id_implements[210]) {
                     int var8 = var5 + var7 - id_throws[64];
                     int var9 = rrzH_2.id_final(var2, var5++);
                     if ((var9 & id_case[51]) != 0 && var5 <= var8) {
                        Long var14 = rrQO.id_throws(rrzH_2.id_try(var2, var5));
                        this.id_class[id_implements[211]] = var14;
                        var5 += 4;
                     }

                     if ((var9 & id_throws[65]) != 0 && var5 <= var8) {
                        Long var15 = rrQO.id_throws(rrzH_2.id_try(var2, var5));
                        this.id_class[id_implements[212]] = var15;
                        var5 += 4;
                     }

                     if ((var9 & id_throws[66]) != 0 && var5 <= var8) {
                        Long var16 = rrQO.id_throws(rrzH_2.id_try(var2, var5));
                        this.id_class[id_implements[213]] = var16;
                     }
                     break;
                  }

                  var5 += var7;
               }
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6526717619808680707L;
   }

   private int id_break(int var1) {
      this.id_final();
      return this.id_class[id_implements[69]] < 0 ? var1 : id_implements[70] | var1 & id_implements[71];
   }

   @Override
   public int id_break() {
      this.id_final();
      return (Integer)this.id_class[id_implements[225]];
   }

   private void id_break(rrzf_3 var1) throws IOException {
      this.id_final();
      if ((byte[])this.id_class[id_implements[177]] != null) {
         int var2 = ((byte[])this.id_class[id_implements[178]]).length;
         int var3 = id_case[40];
         int var4 = id_case[41];
         boolean var5 = id_case[42];

         while (var3 + id_throws[44] < var2) {
            int var7 = rrzH_2.id_while((byte[])this.id_class[id_implements[179]], var3);
            int var8 = rrzH_2.id_while((byte[])this.id_class[id_implements[180]], var3 + id_throws[45]);
            int var6 = var3 + 4;
            if (var6 + var8 > var2) {
               break;
            }

            switch (var7) {
               case 1:
                  if ((Long)this.id_class[id_implements[181]] == id_catch[49]) {
                     if (var6 + id_throws[46] > var2) {
                        break;
                     }

                     Long var13 = rrzH_2.id_catch((byte[])this.id_class[id_implements[182]], var6);
                     this.id_class[id_implements[183]] = var13;
                     var6 += 8;
                  }

                  if ((Long)this.id_class[id_implements[184]] == id_catch[50]) {
                     if (var6 + id_throws[47] > var2) {
                        break;
                     }

                     Long var14 = rrzH_2.id_catch((byte[])this.id_class[id_implements[185]], var6);
                     this.id_class[id_implements[186]] = var14;
                     var6 += 8;
                  }

                  if ((Long)this.id_class[id_implements[187]] == id_catch[51] && var6 + id_throws[48] <= var2) {
                     Long var15 = rrzH_2.id_catch((byte[])this.id_class[id_implements[188]], var6);
                     this.id_class[id_implements[189]] = var15;
                  }
                  break;
               case 10:
                  if (var8 >= id_throws[49]) {
                     var6 += 4;
                     if (rrzH_2.id_while((byte[])this.id_class[id_implements[190]], var6) == id_case[43]
                        && rrzH_2.id_while((byte[])this.id_class[id_implements[191]], var6 + id_throws[50]) == id_throws[51]) {
                        Long var16 = rrQO.id_protected(rrzH_2.id_catch((byte[])this.id_class[id_implements[192]], var6 + id_throws[52]));
                        this.id_class[id_implements[193]] = var16;
                        Long var17 = rrQO.id_protected(rrzH_2.id_catch((byte[])this.id_class[id_implements[194]], var6 + id_throws[53]));
                        this.id_class[id_implements[195]] = var17;
                        Long var18 = rrQO.id_protected(rrzH_2.id_catch((byte[])this.id_class[id_implements[196]], var6 + id_throws[54]));
                        this.id_class[id_implements[197]] = var18;
                     }
                  }
                  break;
               case 21589:
                  if ((Boolean)var1.id_break[id_implements[198]]) {
                     if (var8 == id_throws[55]) {
                        Long var19 = rrQO.id_throws(rrzH_2.id_try((byte[])this.id_class[id_implements[199]], var6 + id_case[44]));
                        this.id_class[id_implements[200]] = var19;
                     }
                  } else if ((Long)this.id_class[id_implements[201]] != id_catch[52]) {
                     this.id_class(var1);
                  } else {
                     var5 = id_case[45];
                  }
                  break;
               default:
                  System.arraycopy((byte[])this.id_class[id_implements[202]], var3, (byte[])this.id_class[id_implements[203]], var4, var8 + id_throws[56]);
                  var4 += var8 + id_throws[57];
            }

            var3 += var8 + id_throws[58];
         }

         if (var5) {
            this.id_class(var1);
         }

         if (var4 != 0 && var4 != ((byte[])this.id_class[id_implements[204]]).length) {
            byte[] var20 = Arrays.copyOf((byte[])this.id_class[id_implements[205]], var4);
            this.id_class[id_implements[206]] = var20;
         } else {
            Object var21 = null;
            this.id_class[id_implements[207]] = var21;
         }
      }
   }

   int id_break(OutputStream var1) throws IOException {
      this.id_final();
      byte[] var2 = this.id_protected[id_implements[130]]
         ? rrQO.id_class((byte[])this.id_protected[id_implements[131]])
         : (byte[])this.id_protected[id_implements[132]];
      int var3 = var2 != null ? var2.length - id_case[24] : id_case[25];
      int var4 = (byte[])this.id_class[id_implements[133]] != null ? ((byte[])this.id_class[id_implements[134]]).length : id_case[26];
      boolean var5 = id_case[27];
      int var6 = id_case[28];
      byte var7 = id_case[29];
      boolean var8 = id_case[30];
      byte var9 = id_case[31];
      byte var10 = id_case[32];
      rrQO.id_break(var1, (Long)rrzH_2.id_class[id_implements[135]]);
      if (((Integer)this.id_class[id_implements[136]] & id_throws[26]) != 0) {
         rrQO.id_class(var1, this.id_class(id_case[33]));
         rrQO.id_class(var1, (Integer)this.id_class[id_implements[137]]);
         rrQO.id_class(var1, (Integer)this.id_class[id_implements[138]]);
         rrQO.id_break(var1, (long)((int)rrQO.id_case((Long)this.id_class[id_implements[139]])));
         rrQO.id_break(var1, id_catch[33]);
         rrQO.id_break(var1, id_catch[34]);
         rrQO.id_break(var1, id_catch[35]);
      } else {
         if ((Long)this.id_class[id_implements[140]] >= id_catch[36] || (Long)this.id_class[id_implements[141]] >= id_catch[37]) {
            var7 = id_throws[27];
            var8 = id_case[34];
         }

         rrQO.id_class(var1, this.id_class(var8));
         rrQO.id_class(var1, (Integer)this.id_class[id_implements[142]]);
         rrQO.id_class(var1, (Integer)this.id_class[id_implements[143]]);
         rrQO.id_break(var1, (long)((int)rrQO.id_case((Long)this.id_class[id_implements[144]])));
         rrQO.id_break(var1, (Long)this.id_class[id_implements[145]]);
         if (var8) {
            rrQO.id_break(var1, id_catch[38]);
            rrQO.id_break(var1, id_catch[39]);
         } else {
            rrQO.id_break(var1, (Long)this.id_class[id_implements[146]]);
            rrQO.id_break(var1, (Long)this.id_class[id_implements[147]]);
         }
      }

      while (var6 + id_throws[28] < var4) {
         int var11 = rrzH_2.id_while((byte[])this.id_class[id_implements[148]], var6);
         int var12 = rrzH_2.id_while((byte[])this.id_class[id_implements[149]], var6 + id_throws[29]);
         if (var11 == id_implements[150] || var11 == id_throws[30]) {
            var5 = id_case[35];
         }

         var6 += id_throws[31] + var12;
      }

      if (!var5) {
         if ((Boolean)rrzf_3.id_class[id_implements[151]]) {
            var10 = id_throws[32];
         } else {
            var9 = id_throws[33];
            if ((Long)this.id_class[id_implements[152]] != id_catch[40]) {
               var9 += 4;
            }

            if ((Long)this.id_class[id_implements[153]] != id_catch[41]) {
               var9 += 4;
            }
         }
      }

      rrQO.id_class(var1, var3);
      rrQO.id_class(var1, var4 + var7 + var10 + var9);
      rrQO.id_class(var1, var2, id_case[36], var3);
      if (var8) {
         rrQO.id_class(var1, id_case[37]);
         rrQO.id_class(var1, id_throws[34]);
         rrQO.id_class(var1, (Long)this.id_class[id_implements[154]]);
         rrQO.id_class(var1, (Long)this.id_class[id_implements[155]]);
      }

      if (var10 != 0) {
         rrQO.id_class(var1, id_throws[35]);
         rrQO.id_class(var1, var10 - id_throws[36]);
         rrQO.id_break(var1, id_catch[42]);
         rrQO.id_class(var1, id_case[38]);
         rrQO.id_class(var1, id_throws[37]);
         rrQO.id_class(var1, rrQO.id_class((Long)this.id_class[id_implements[156]]));
         rrQO.id_class(var1, rrQO.id_class((Long)this.id_class[id_implements[157]]));
         rrQO.id_class(var1, rrQO.id_class((Long)this.id_class[id_implements[158]]));
      }

      if (var9 != 0) {
         rrQO.id_class(var1, id_implements[159]);
         rrQO.id_class(var1, var9 - id_throws[38]);
         byte var13 = id_case[39];
         if ((Long)this.id_class[id_implements[160]] != id_catch[43]) {
            var13 |= id_throws[39];
         }

         if ((Long)this.id_class[id_implements[161]] != id_catch[44]) {
            var13 |= id_throws[40];
         }

         var1.write(var13);
         rrQO.id_break(var1, rrQO.id_byte((Long)this.id_class[id_implements[162]]));
         if ((Long)this.id_class[id_implements[163]] != id_catch[45]) {
            rrQO.id_break(var1, rrQO.id_byte((Long)this.id_class[id_implements[164]]));
         }

         if ((Long)this.id_class[id_implements[165]] != id_catch[46]) {
            rrQO.id_break(var1, rrQO.id_byte((Long)this.id_class[id_implements[166]]));
         }
      }

      if ((byte[])this.id_class[id_implements[167]] != null) {
         rrQO.id_class(var1, (byte[])this.id_class[id_implements[168]]);
      }

      return id_throws[41] + var3 + var4 + var7 + var10 + var9;
   }

   @Override
   public byte[] id_throws() {
      this.id_final();
      return (byte[])this.id_class[id_implements[229]] != null
         ? Arrays.copyOf((byte[])this.id_class[id_implements[230]], ((byte[])this.id_class[id_implements[231]]).length)
         : null;
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{1, 2, 3, 4};
      id_break = var0;
   }

   private static void id_extends() {
      id_catch = new long[]{
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         0L,
         0L,
         0L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         -1L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         0L,
         4294967295L,
         4294967295L,
         4294967295L,
         0L,
         -1L,
         0L,
         0L,
         0L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         -1L,
         -1L,
         0L,
         -1L,
         -1L,
         -1L,
         -1L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         4294967295L,
         30L,
         -1L,
         -1L,
         0L,
         0L,
         0L,
         0L,
         0L,
         0L,
         0L
      };
   }

   @Override
   public long id_case() {
      this.id_final();
      return (Long)this.id_class[id_implements[224]];
   }

   private static void id_implements() {
      id_case = new boolean[]{
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true
      };
   }

   private static void id_package() {
      id_throws = new byte[]{
         -1,
         -1,
         -1,
         -1,
         -1,
         -1,
         45,
         8,
         20,
         10,
         3,
         4,
         2,
         10,
         4,
         36,
         9,
         16,
         4,
         10,
         4,
         24,
         4,
         3,
         7,
         46,
         8,
         20,
         4,
         2,
         10,
         4,
         36,
         9,
         16,
         10,
         4,
         24,
         4,
         2,
         4,
         30,
         24,
         16,
         4,
         2,
         8,
         8,
         8,
         32,
         2,
         24,
         4,
         12,
         20,
         5,
         4,
         4,
         4,
         30,
         16,
         9,
         4,
         2,
         4,
         2,
         4,
         -1,
         16,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         14,
         4,
         2,
         2,
         3,
         3,
         4
      };
   }

   @Override
   public long id_protected() {
      this.id_final();
      return (Long)this.id_class[id_implements[223]];
   }

   private void id_final() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[68]];
         Object[] var1 = this.id_class;
         var1[id_throws[69]] = Integer.valueOf(id_case[85]);
         var1[id_throws[70]] = Integer.valueOf(id_case[86]);
         var1[id_throws[71]] = Integer.valueOf(id_case[87]);
         var1[id_throws[72]] = Integer.valueOf(id_case[88]);
         var1[id_throws[73]] = Integer.valueOf(id_case[89]);
         var1[id_throws[74]] = id_catch[56];
         var1[id_throws[75]] = id_catch[57];
         var1[id_throws[76]] = id_catch[58];
         var1[id_throws[77]] = id_catch[59];
         var1[id_throws[78]] = id_catch[60];
         var1[id_throws[79]] = id_catch[61];
         var1[id_throws[80]] = id_catch[62];
      }
   }

   private static void id_volatile() {
      id_finally = new int[]{65535};
   }

   private static void id_native() {
      id_private = new String[]{
         new String("posix:permissions"),
         new String("unsupported compression method"),
         new String("invalid CEN header (bad signature)"),
         new String("loc: reading failed"),
         new String("loc extra: reading failed"),
         new String("    name            : %s%n"),
         new String("    creationTime    : %tc%n"),
         new String("    lastAccessTime  : %tc%n"),
         new String("    lastModifiedTime: %tc%n"),
         new String("    isRegularFile   : %b%n"),
         new String("    isDirectory     : %b%n"),
         new String("    isSymbolicLink  : %b%n"),
         new String("    isOther         : %b%n"),
         new String("    fileKey         : %s%n"),
         new String("    size            : %d%n"),
         new String("    compressedSize  : %d%n"),
         new String("    crc             : %x%n"),
         new String("    method          : %d%n"),
         new String("    permissions     : %s%n")
      };
   }

   @Override
   public boolean isDirectory() {
      return this.id_catch();
   }

   @Override
   public FileTime lastModifiedTime() {
      this.id_final();
      return FileTime.fromMillis((Long)this.id_class[id_implements[221]]);
   }

   @Override
   public Object fileKey() {
      return null;
   }

   @Override
   public boolean isRegularFile() {
      return !this.id_catch() ? id_case[81] : id_case[82];
   }

   @Override
   public FileTime lastAccessTime() {
      this.id_final();
      return FileTime.fromMillis(
         this.id_class[id_implements[218]] == id_catch[55] ? (Long)this.id_class[id_implements[219]] : (Long)this.id_class[id_implements[220]]
      );
   }

   @Override
   public FileTime creationTime() {
      this.id_final();
      return FileTime.fromMillis(
         this.id_class[id_implements[215]] == id_catch[54] ? (Long)this.id_class[id_implements[216]] : (Long)this.id_class[id_implements[217]]
      );
   }

   @Override
   public boolean isSymbolicLink() {
      return id_case[83];
   }

   @Override
   public boolean isOther() {
      return id_case[80];
   }
}

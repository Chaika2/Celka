package celestial;

public class rxv_3 extends rxx_3 {
   private final rpr_3 id_break;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rxv_3(rYB var1, rfH_2 var2, rpr_3 var3, rdn_3 var4, rpr_3 var5) {
      super(var1, null, rpm_3.MAIN_HAND, var4, new rff_3(rjU_2.id_protected(var2), var5, var2, false));
      this.id_break = var3;
   }

   @Override
   public rfH_2 id_class() {
      return this.id_implements().id_class();
   }

   @Override
   public boolean id_break() {
      return this.id_int().id_byte(this.id_implements().id_class()).id_class(this);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rpr_3[] id_throws() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.util.ConcurrentModificationException
      //   at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
      //   at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.findExprents(SwitchHelper.java:538)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.getAssignmentsOfWithinOneStatement(SwitchHelper.java:512)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplify(SwitchHelper.java:61)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:30)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:84)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:348)
      //   at org.jetbrains.java.decompiler.main.ClassesProcessor.writeClass(ClassesProcessor.java:474)
      //   at org.jetbrains.java.decompiler.main.Fernflower.getClassContent(Fernflower.java:191)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.lambda$save$3(ContextUnit.java:187)
      //
      // Bytecode:
      // 000: getstatic celestial/rxF_2.id_class [I
      // 003: aload 0
      // 004: getfield celestial/rxv_3.id_break Lcelestial/rpr_3;
      // 007: invokevirtual celestial/rpr_3.ordinal ()I
      // 00a: iaload
      // 00b: tableswitch 37 1 6 37 79 121 163 205 247
      // 030: bipush 6
      // 032: anewarray 62
      // 035: dup
      // 036: bipush 0
      // 037: getstatic celestial/rpr_3.DOWN Lcelestial/rpr_3;
      // 03a: aastore
      // 03b: dup
      // 03c: bipush 1
      // 03d: getstatic celestial/rpr_3.NORTH Lcelestial/rpr_3;
      // 040: aastore
      // 041: dup
      // 042: bipush 2
      // 043: getstatic celestial/rpr_3.EAST Lcelestial/rpr_3;
      // 046: aastore
      // 047: dup
      // 048: bipush 3
      // 049: getstatic celestial/rpr_3.SOUTH Lcelestial/rpr_3;
      // 04c: aastore
      // 04d: dup
      // 04e: bipush 4
      // 04f: getstatic celestial/rpr_3.WEST Lcelestial/rpr_3;
      // 052: aastore
      // 053: dup
      // 054: bipush 5
      // 055: getstatic celestial/rpr_3.UP Lcelestial/rpr_3;
      // 058: aastore
      // 059: areturn
      // 05a: bipush 6
      // 05c: anewarray 62
      // 05f: dup
      // 060: bipush 0
      // 061: getstatic celestial/rpr_3.DOWN Lcelestial/rpr_3;
      // 064: aastore
      // 065: dup
      // 066: bipush 1
      // 067: getstatic celestial/rpr_3.UP Lcelestial/rpr_3;
      // 06a: aastore
      // 06b: dup
      // 06c: bipush 2
      // 06d: getstatic celestial/rpr_3.NORTH Lcelestial/rpr_3;
      // 070: aastore
      // 071: dup
      // 072: bipush 3
      // 073: getstatic celestial/rpr_3.EAST Lcelestial/rpr_3;
      // 076: aastore
      // 077: dup
      // 078: bipush 4
      // 079: getstatic celestial/rpr_3.SOUTH Lcelestial/rpr_3;
      // 07c: aastore
      // 07d: dup
      // 07e: bipush 5
      // 07f: getstatic celestial/rpr_3.WEST Lcelestial/rpr_3;
      // 082: aastore
      // 083: areturn
      // 084: bipush 6
      // 086: anewarray 62
      // 089: dup
      // 08a: bipush 0
      // 08b: getstatic celestial/rpr_3.DOWN Lcelestial/rpr_3;
      // 08e: aastore
      // 08f: dup
      // 090: bipush 1
      // 091: getstatic celestial/rpr_3.NORTH Lcelestial/rpr_3;
      // 094: aastore
      // 095: dup
      // 096: bipush 2
      // 097: getstatic celestial/rpr_3.EAST Lcelestial/rpr_3;
      // 09a: aastore
      // 09b: dup
      // 09c: bipush 3
      // 09d: getstatic celestial/rpr_3.WEST Lcelestial/rpr_3;
      // 0a0: aastore
      // 0a1: dup
      // 0a2: bipush 4
      // 0a3: getstatic celestial/rpr_3.UP Lcelestial/rpr_3;
      // 0a6: aastore
      // 0a7: dup
      // 0a8: bipush 5
      // 0a9: getstatic celestial/rpr_3.SOUTH Lcelestial/rpr_3;
      // 0ac: aastore
      // 0ad: areturn
      // 0ae: bipush 6
      // 0b0: anewarray 62
      // 0b3: dup
      // 0b4: bipush 0
      // 0b5: getstatic celestial/rpr_3.DOWN Lcelestial/rpr_3;
      // 0b8: aastore
      // 0b9: dup
      // 0ba: bipush 1
      // 0bb: getstatic celestial/rpr_3.SOUTH Lcelestial/rpr_3;
      // 0be: aastore
      // 0bf: dup
      // 0c0: bipush 2
      // 0c1: getstatic celestial/rpr_3.EAST Lcelestial/rpr_3;
      // 0c4: aastore
      // 0c5: dup
      // 0c6: bipush 3
      // 0c7: getstatic celestial/rpr_3.WEST Lcelestial/rpr_3;
      // 0ca: aastore
      // 0cb: dup
      // 0cc: bipush 4
      // 0cd: getstatic celestial/rpr_3.UP Lcelestial/rpr_3;
      // 0d0: aastore
      // 0d1: dup
      // 0d2: bipush 5
      // 0d3: getstatic celestial/rpr_3.NORTH Lcelestial/rpr_3;
      // 0d6: aastore
      // 0d7: areturn
      // 0d8: bipush 6
      // 0da: anewarray 62
      // 0dd: dup
      // 0de: bipush 0
      // 0df: getstatic celestial/rpr_3.DOWN Lcelestial/rpr_3;
      // 0e2: aastore
      // 0e3: dup
      // 0e4: bipush 1
      // 0e5: getstatic celestial/rpr_3.WEST Lcelestial/rpr_3;
      // 0e8: aastore
      // 0e9: dup
      // 0ea: bipush 2
      // 0eb: getstatic celestial/rpr_3.SOUTH Lcelestial/rpr_3;
      // 0ee: aastore
      // 0ef: dup
      // 0f0: bipush 3
      // 0f1: getstatic celestial/rpr_3.UP Lcelestial/rpr_3;
      // 0f4: aastore
      // 0f5: dup
      // 0f6: bipush 4
      // 0f7: getstatic celestial/rpr_3.NORTH Lcelestial/rpr_3;
      // 0fa: aastore
      // 0fb: dup
      // 0fc: bipush 5
      // 0fd: getstatic celestial/rpr_3.EAST Lcelestial/rpr_3;
      // 100: aastore
      // 101: areturn
      // 102: bipush 6
      // 104: anewarray 62
      // 107: dup
      // 108: bipush 0
      // 109: getstatic celestial/rpr_3.DOWN Lcelestial/rpr_3;
      // 10c: aastore
      // 10d: dup
      // 10e: bipush 1
      // 10f: getstatic celestial/rpr_3.EAST Lcelestial/rpr_3;
      // 112: aastore
      // 113: dup
      // 114: bipush 2
      // 115: getstatic celestial/rpr_3.SOUTH Lcelestial/rpr_3;
      // 118: aastore
      // 119: dup
      // 11a: bipush 3
      // 11b: getstatic celestial/rpr_3.UP Lcelestial/rpr_3;
      // 11e: aastore
      // 11f: dup
      // 120: bipush 4
      // 121: getstatic celestial/rpr_3.NORTH Lcelestial/rpr_3;
      // 124: aastore
      // 125: dup
      // 126: bipush 5
      // 127: getstatic celestial/rpr_3.WEST Lcelestial/rpr_3;
      // 12a: aastore
      // 12b: areturn
   }

   @Override
   public boolean id_catch() {
      return false;
   }

   @Override
   public rpr_3 id_case() {
      return this.id_break.id_final() == rpB_2.Y ? rpr_3.NORTH : this.id_break;
   }

   @Override
   public rpr_3 id_protected() {
      return rpr_3.DOWN;
   }

   @Override
   public float id_private() {
      return (float)(this.id_break.id_protected() * 90);
   }
}

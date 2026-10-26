package celestial;

enum rrES {
   VINDICATOR(aI_2.U, new int[]{0, 0, 2, 0, 1, 4, 2, 5}),
   EVOKER(aI_2.id_return, new int[]{0, 0, 0, 0, 0, 1, 1, 2}),
   PILLAGER(aI_2.W, new int[]{0, 4, 3, 3, 4, 4, 4, 2}),
   WITCH(aI_2.a, new int[]{0, 0, 0, 0, 3, 0, 0, 1}),
   RAVAGER(aI_2.u, new int[]{0, 0, 0, 1, 0, 1, 0, 2});

   static final rrES[] VALUES = values();
   final aI_2<? extends rEB> type;
   final int[] waveCounts;

   private rrES(aI_2<? extends rEB> var3, int[] var4) {
      this.type = var3;
      this.waveCounts = var4;
   }
}

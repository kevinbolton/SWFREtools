package tv.porst.swfretools.parser.structures;

import tv.porst.splib.binaryparser.IFileElement;
import tv.porst.swfretools.parser.SWFParserHelpers;

public class ConstantPool implements IFileElement {

	private final EncodedU30 intCount;
	private final EncodedS32List integers;
	private final EncodedU30 uintCount;
	private final EncodedU32List uintegers;
	private final EncodedU30 doubleCount;
	private final Float64List doubles;
	private final EncodedU30 stringCount;
	private final StringInfoList strings;
	private final EncodedU30 namespaceCount;
	private final NamespaceInfoList namespaces;
	private final EncodedU30 namespaceSetCount;
	private final NamespaceSetInfoList namespaceSets;
	private final EncodedU30 multinameCount;
	private final MultinameInfoList multinames;

	public ConstantPool(final EncodedU30 intCount, final EncodedS32List integers,
			final EncodedU30 uintCount, final EncodedU32List uintegers,
			final EncodedU30 doubleCount, final Float64List doubles,
			final EncodedU30 stringCount, final StringInfoList strings,
			final EncodedU30 namespaceCount, final NamespaceInfoList namespaces,
			final EncodedU30 namespaceSetCount, final NamespaceSetInfoList namespaceSets,
			final EncodedU30 multinameCount, final MultinameInfoList multinames) {

		this.intCount = intCount;
		this.integers = integers;
		this.uintCount = uintCount;
		this.uintegers = uintegers;
		this.doubleCount = doubleCount;
		this.doubles = doubles;
		this.stringCount = stringCount;
		this.strings = strings;
		this.namespaceCount = namespaceCount;
		this.namespaces = namespaces;
		this.namespaceSetCount = namespaceSetCount;
		this.namespaceSets = namespaceSets;
		this.multinameCount = multinameCount;
		this.multinames = multinames;
	}

	@Override
	public int getBitLength() {
		return SWFParserHelpers.addBitLengths(intCount, integers, uintCount, uintegers, doubleCount,
				doubles, stringCount, strings, namespaceCount, namespaces, namespaceSetCount,
				namespaceSets, multinameCount, multinames);
	}

	@Override
	public int getBitPosition() {
		return intCount.getBitPosition();
	}

}

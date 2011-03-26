package tv.porst.swfretools.parser.structures;

import tv.porst.swfretools.parser.SWFParserHelpers;

public class MultinameA implements IMultiname {

	private final EncodedU30 name;
	private final EncodedU30 nsSet;

	public MultinameA(final EncodedU30 name, final EncodedU30 nsSet) {
		this.name = name;
		this.nsSet = nsSet;
	}

	@Override
	public int getBitLength() {
		return SWFParserHelpers.addBitLengths(name, nsSet);
	}

	@Override
	public int getBitPosition() {
		return name.getBitPosition();
	}

}

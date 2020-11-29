import MeCab


def print_words_and_results(raw_text: str = 'すもももももももものうち'):
    mecab = MeCab.Tagger('')
    node = mecab.parse(raw_text)
    print(node)


def print_morpheme(raw_text: str = 'すもももももももものうち'):
    mecab = MeCab.Tagger('-Ochasen')
    node = mecab.parseToNode(raw_text)
    meishi_list = []

    while node:
        if node.feature.split(",")[0] == "名詞":
            meishi_list.append(node.surface)
        node = node.next
    print(node)
    print("名詞:" + str(meishi_list))


if __name__ == '__main__':
    print_words_and_results()
    print_morpheme()
